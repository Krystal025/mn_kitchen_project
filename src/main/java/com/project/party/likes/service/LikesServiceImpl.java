package com.project.party.likes.service;

import com.project.party.likes.dao.LikesMapper;
import com.project.party.likes.dto.LikesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LikesServiceImpl implements LikesService {

    private final LikesMapper likesMapper;

    //좋아요 토글 메소드
    @Override
    public String toggleLike(LikesDto likesDto) {
        int likeStatus = likesMapper.isLikedByUser(likesDto);
        if (likeStatus == 1) {
            //이미 좋아요를 누른 경우, 좋아요 기록 삭제
            likesMapper.deleteLike(likesDto);
            return "Like Deleted!";
        } else {
            //좋아요를 누르지 않은 경우, 좋아요 기록 저장
            likesMapper.insertLike(likesDto);
            return "Like Inserted!";
        }
    }

    //좋아요 개수 반환 메소드
    @Override
    public int countLikes(int postId) {

        return likesMapper.countLikes(postId);
    }

    //좋아요 여부 반환 메소드 (초기화 방지)
    @Override
    public int isLikedByUser(LikesDto likesDto) {

        return likesMapper.isLikedByUser(likesDto);
    }

    //좋아요 순위별 조회 메소드
    @Override
    public List<LikesDto> orderByLike() {
        LikesDto dto = new LikesDto();

        return likesMapper.orderByLike(dto);
    }
}
