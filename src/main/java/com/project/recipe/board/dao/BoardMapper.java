package com.project.recipe.board.dao;

import com.project.recipe.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    //게시글 추가
    void insertRcp(BoardDto dto);

    //게시글 수정
    void updateRcp(BoardDto dto);

    //게시글 삭제
    void deleteRcp(int rcpNum);

    //글 목록 조회
    List<BoardDto> getList(BoardDto dto);

    //글 목록 + 좋아요 조회
    List<BoardDto> getListWithLikes(BoardDto dto);

    //글 상세 조회
    BoardDto getDetail(int rcpNum);

    //조회수 증가
    void addViewCount(int num);

    //나의 글 목록 조회
    List<BoardDto> getMyList(BoardDto dto);

    //카테고리 별 게시글 목록 조회
    List<BoardDto> getByCategory(BoardDto dto);

}
