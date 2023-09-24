package com.project.user.dao;

import com.project.user.dto.FollowDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface FollowMapper {
    void insertFollow(FollowDto followDto);
    int deleteFollow(FollowDto followDto);
    int countFollow(FollowDto followDto);
    int countFollowers(String userEmail);
    int countFollowings(String userEmail);
    int isFollowing(@Param("followerEmail") String followerEmail, @Param("followingEmail") String followingEmail);
}
