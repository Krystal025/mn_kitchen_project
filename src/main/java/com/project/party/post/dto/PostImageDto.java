package com.project.party.post.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostImageDto {

    private int imageId;  //이미지 ID
    private int postId;   //게시글 ID
    private String imageUrl;  //이미지 경로
    private MultipartFile imageFile;  //이미지 파일
}
