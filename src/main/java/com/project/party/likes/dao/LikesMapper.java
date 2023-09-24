package com.project.party.likes.dao;

import com.project.party.likes.dto.LikesDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LikesMapper {

    //좋아요 추가
    void insertLike(LikesDto likesDto);

    //좋아요 삭제
    void deleteLike(LikesDto likesDto);

    //좋아요 개수
    int countLikes(int postId);

    //좋아요 여부 확인
    int isLikedByUser(LikesDto likesDto);

    //좋아요 순위별 조회
    List<LikesDto> orderByLike(LikesDto dto);

}