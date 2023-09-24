package com.project.party.comment.controller;

import com.project.party.comment.dto.CommentDto;
import com.project.party.comment.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/party/comment")
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    //댓글 작성
    @PostMapping("/insert")
    public ResponseEntity<?> insertComment(@RequestBody CommentDto commentDto) {
        commentService.insertComment(commentDto);
        return new ResponseEntity<>("Insert Complete!", HttpStatus.CREATED);
    }

    //댓글 수정
    @PostMapping("/update")
    public ResponseEntity<?> updateComment(@RequestBody CommentDto commentDto) {
        commentService.updateComment(commentDto);
        return new ResponseEntity<>("Update Complete!", HttpStatus.OK);
    }

    //댓글 삭제
    @PostMapping("/delete/{commentId}")
    public ResponseEntity<?> deleteComment(@PathVariable int commentId) {
        commentService.deleteComment(commentId);
        return new ResponseEntity<>("Delete Complete", HttpStatus.OK);
    }

    //게시글 댓글 목록
    @GetMapping("/commentList/{postId}")
    public ResponseEntity<List<CommentDto>> getCommentList(@PathVariable int postId) {
        return ResponseEntity.ok(commentService.getCommentList(postId));
    }

    //나의 댓글 목록
    @GetMapping("/myCommentList/{userNum}")
    public ResponseEntity<List<CommentDto>> getMyCommentList(@PathVariable int userNum) {
        return ResponseEntity.ok(commentService.getMyCommentList(userNum));
    }
}