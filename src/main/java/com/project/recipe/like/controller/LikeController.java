package com.project.recipe.like.controller;

import com.project.recipe.like.dto.LikeDto;
import com.project.recipe.like.service.LikeService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/recipe/like")
@RequiredArgsConstructor
public class LikeController {
    private final LikeService likeService;

    @Value("${file.location}")
    private String imgPath;

    @GetMapping(
            value = "/image/{imagePath}",
            produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_GIF_VALUE})
    @ResponseBody
    public byte[] getPostImage(@PathVariable("imagePath") String imgName) throws IOException {
        String absolutePath = imgPath + File.separator + imgName;
        InputStream is = new FileInputStream(absolutePath);
        return IOUtils.toByteArray(is);
    }

    //좋아요 토글
    @Transactional
    @PostMapping("/toggle")
    public ResponseEntity<String> toggleLike(@RequestBody LikeDto dto) {
        String result = likeService.toggleLike(dto);
        HttpStatus status = "Like Inserted".equals(result) ? HttpStatus.OK : HttpStatus.INTERNAL_SERVER_ERROR;

        return new ResponseEntity<>(result, status);
    }

    //좋아요 개수
    @GetMapping("/count")
    public ResponseEntity<Integer> countLike(@RequestParam int rcpNum) {

        int result = likeService.countLike(rcpNum);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    //좋아요 여부
    @GetMapping("/isLiked")
    public ResponseEntity<Integer> isLikedByUser(@RequestBody LikeDto dto) {

        int result = likeService.isLikedByUser(dto);
        HttpStatus status = result == 1 ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(result, status);
    }

    //좋아요 순위별 조회
    @GetMapping("/order")
    public ResponseEntity<?> orderByLike() {
        List<LikeDto> result = likeService.orderByLike();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}

