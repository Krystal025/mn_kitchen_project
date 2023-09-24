package com.project.party.comment.dao;

import com.project.party.comment.dto.CommentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommentMapper {
    //댓글 추가
    void insertComment(CommentDto commentDto);
    //댓글 수정
    void updateComment(CommentDto commentDto);
    //댓글 삭제
    void deleteComment(int commentId);
    //게시글 댓글 목록
    List<CommentDto> getCommentList(int postId);
    //나의 댓글 목록
    List<CommentDto> getMyCommentList(int userNum);
}
