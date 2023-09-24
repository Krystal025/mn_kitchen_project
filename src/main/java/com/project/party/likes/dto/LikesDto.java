package com.project.party.likes.dto;

import lombok.*;

//좋아요 관련 데이터 전송 객체
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LikesDto {
    private int id; //좋아요 ID
    private int postId; //게시글 ID
    private int userNum; //사용자 ID
    private String createdAt; //좋아요 생성 시인
    private int likeCount;  //좋아요 개수
    private String imageUrl; //이미지 경로
    private int liked; //좋아요 여부
}
