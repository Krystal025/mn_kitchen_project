package com.project.party.likes.controller;

import com.project.party.likes.dto.LikesDto;
import com.project.party.likes.service.LikesService;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@RestController
@RequestMapping("/party/likes")
@RequiredArgsConstructor
public class LikesController {

    private final LikesService likesService;

    @Value("${file.location}")
    private String imgPath;

    @GetMapping(
            value = "/image/{imageUrl}",
            produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE, MediaType.IMAGE_GIF_VALUE})
    @ResponseBody
    public byte[] getRcpMainImage(@PathVariable("imageUrl") String imgName) throws IOException {
        String absolutePath = imgPath + File.separator + imgName;
        InputStream is = new FileInputStream(absolutePath);
        return IOUtils.toByteArray(is);
    }

    //좋아요 토글
    @PostMapping("/toggle")
    public ResponseEntity<String> toggleLike(@RequestBody LikesDto likesDto) {
        String message = likesService.toggleLike(likesDto);
        return ResponseEntity.ok(message);
    }

    //좋아요 개수
    @GetMapping("/count/{postId}")
    public ResponseEntity<Integer> countLikes(@PathVariable int postId) {
        int count = likesService.countLikes(postId);
        return ResponseEntity.ok(count);
    }

    //좋아요 여부
    @GetMapping("/isLiked")
    public ResponseEntity<Integer> isLikedByUser(@RequestBody LikesDto likesDto) {
        int result = likesService.isLikedByUser(likesDto);
        HttpStatus status = result == 1 ? HttpStatus.OK : HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(result, status);
    }

    //좋아요 순위
    @GetMapping("/order")
    public ResponseEntity<?> orderByLike() {
        List<LikesDto> result = likesService.orderByLike();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}