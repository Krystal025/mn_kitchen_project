package com.project.party.comment.service;

import com.project.party.comment.dto.CommentDto;

import java.util.List;

public interface CommentService {
    //댓글 추가
    void insertComment(CommentDto commentDto);

    //댓글 수정
    void updateComment(CommentDto commentDto);

    //댓글 삭제
    void deleteComment(int commentId);

    //게시글 댓글 조회
    List<CommentDto> getCommentList(int postId);

    //나의 댓글 조회
    List<CommentDto> getMyCommentList(int userNum);
}

