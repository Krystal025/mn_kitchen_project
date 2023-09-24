package com.project.party.post.service;

import com.project.party.post.dto.PostDto;
import com.project.recipe.board.dto.BoardDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

public interface PostService {
    //게시글 생성
    void insertPost(PostDto postDto);

    //게시글 수정
    void updatePost(PostDto postDto, MultipartFile image);

    //게시글 삭제
    void deletePost(int postId);

    //전체 게시글 + 좋아요 목록
    List<PostDto> getListWithLikes(String keyword, String condition, Integer userNum);

    //하나의 게시글을 조회
    PostDto getDetail(int postId);

    //이미지 업로드 메서드
    void insertImage(MultipartFile image, int postId);

    //이미지 삭제 메서드
    void deleteImage(int postId);

    //나의 글 목록 조회
    List<PostDto> getMyList(int userNum);

    //사용자 번호로 게시글 번호 조회
    List<Integer> getPostId(int userNum);
}
