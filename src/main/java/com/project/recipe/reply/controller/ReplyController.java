package com.project.recipe.reply.controller;

import com.project.recipe.reply.dto.ReplyDto;
import com.project.recipe.reply.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe/reply")
@RequiredArgsConstructor
public class ReplyController {

    private final ReplyService rplService;

    //댓글 작성
    @PostMapping("/insert")
    public ResponseEntity<?> insertRpl(@RequestBody ReplyDto dto) {
        rplService.saveReply(dto);
        return new ResponseEntity<>("Insert Complete!", HttpStatus.CREATED);
    }

    //댓글 수정
    @PostMapping("/update")
    public ResponseEntity<?> updateRpl(@RequestBody ReplyDto dto) {
        rplService.updateReply(dto);
        return new ResponseEntity<>("Update Complete!", HttpStatus.OK);
    }

    //댓글 삭제
    @PostMapping("/delete")
    public ResponseEntity<?> deleteRpl(@RequestParam int rplNum) {
        rplService.deleteReply(rplNum);
        return new ResponseEntity<>("Delete Complete!", HttpStatus.OK);
    }

    //댓글 목록
    @GetMapping("/rplList")
    public ResponseEntity<List<ReplyDto>> getRplList(@RequestParam int rcpNum) {
        return ResponseEntity.ok(rplService.getRplList(rcpNum));
    }

    //나의 댓글 목록
    @GetMapping("/myRplList/{userNum}")
    public ResponseEntity<List<ReplyDto>> getMyRplList(@PathVariable int userNum) {

        return ResponseEntity.ok(rplService.getMyRplList(userNum));
    }

}
