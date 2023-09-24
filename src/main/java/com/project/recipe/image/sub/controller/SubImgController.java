package com.project.recipe.image.sub.controller;

import com.project.recipe.image.sub.service.SubImgService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe/subImg")
@RequiredArgsConstructor
public class SubImgController {

    private final SubImgService subImgService;

    //서브이미지 삭제
    @DeleteMapping("/delete")
    public ResponseEntity<?> deleteImg(@RequestParam int subNum) {
        subImgService.deleteImg(subNum);
        return new ResponseEntity<>("Delete Complete!", HttpStatus.OK);
    }
}
