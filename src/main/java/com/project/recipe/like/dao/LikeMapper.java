package com.project.recipe.like.dao;

import com.project.party.likes.dto.LikesDto;
import com.project.recipe.like.dto.LikeDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LikeMapper {

    //좋아요 추가
    void insertLike(LikeDto dto);

    //좋아요 삭제
    void deleteLike(LikeDto dto);

    //좋아요 개수
    int countLike(int rcpNum);

    //좋아요 여부 확인
    int isLikedByUser(LikeDto dto);

    //좋아요 순위별 조회
    List<LikeDto> orderByLike(LikeDto dto);
}