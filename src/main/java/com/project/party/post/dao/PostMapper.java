package com.project.party.post.dao;

import com.project.party.post.dto.PostDto;
import com.project.party.post.dto.PostImageDto;
import com.project.recipe.board.dto.BoardDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {

    //게시글 저장
    void insertPost(PostDto postDto);

    //전체 글을 조회
    List<PostDto> getList(PostDto dto);

    //전체 글 + 좋아요 조회
    List<PostDto> getListWithLikes(PostDto dto);

    //하나의 글을 조회
    PostDto getDetail(int post_id);

    //하나의 글을 수정
    void updatePost(PostDto postDto);

    //하나의 글을 삭제
    void deletePost(int postId);

    //이미지 업로드 메서드
    void insertImage(PostImageDto postImageDto);

    //이미지 삭제 메서드
    void deleteImage(int postId);

    //조회수 증가 메서드
    void addViewCount(int postId);

    //나의 글 목록 조회 메서드
    List<PostDto> getMyList(int userNum);

    //사용자 번호로 게시글 번호 조회
    List<Integer> getPostId(int userNum);
}
