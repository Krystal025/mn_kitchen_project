package com.project.recipe.reply.dao;

import com.project.recipe.reply.dto.ReplyDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
    //댓글 추가
    void insertRpl(ReplyDto dto);

    //댓글 수정
    void updateRpl(ReplyDto dto);

    //댓글 삭제
    void deleteRpl(int rplNum);

    //게시글 댓글 목록
    List<ReplyDto> getRplList(int rcpNum);

    //나의 댓글 목록
    List<ReplyDto> getMyRplList(int userNum);

}
