package com.project.party.comment.service;

import com.project.party.comment.dao.CommentMapper;
import com.project.party.comment.dto.CommentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService {

    private final CommentMapper commentMapper;

    //댓글 생성
    @Override
    public void insertComment(CommentDto commentDto) {
        commentMapper.insertComment(commentDto);
    }

    //댓글 수정
    @Override
    public void updateComment(CommentDto commentDto) {
        commentMapper.updateComment(commentDto);
    }

    //댓글 삭제
    @Override
    public void deleteComment(int commentId) {
        commentMapper.deleteComment(commentId);
    }

    //게시글 댓글 목록 조회
    @Override
    public List<CommentDto> getCommentList(int postId) {
        CommentDto dto = new CommentDto();
        dto.setPostId(postId);
        //해당 게시글 번호에 대한 댓글 목록 조회
        List<CommentDto> commentList = commentMapper.getCommentList(postId);
        //댓글 목록 반환
        return commentList;
    }

    //나의 댓글 조회
    @Override
    public List<CommentDto> getMyCommentList(int userNum) {
        //dto 객체에 사용자로부터 받은 userNum과 postId 저장
        CommentDto dto = new CommentDto();
        dto.setUserNum(userNum);
        //특정 사용자가 작성한 댓글에 대한 게시글 목록 조회
        List<CommentDto> myCommentList = commentMapper.getMyCommentList(userNum);
        //나의 댓글 목록 반환
        return myCommentList;
    }


}
