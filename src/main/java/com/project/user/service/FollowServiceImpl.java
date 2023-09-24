package com.project.user.service;

import com.project.user.dao.FollowMapper;
import com.project.user.dto.FollowDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FollowServiceImpl implements FollowService{

    private final FollowMapper followMapper;

    @Override
    public String toggleFollow(FollowDto followDto) {
        int count = followMapper.countFollow(followDto);

        if (count > 0) {
            followMapper.deleteFollow(followDto);
            return "Unfollowed successfully";
        } else {
            followMapper.insertFollow(followDto);
            return "Followed successfully";
        }
    }

    @Override
    public int countFollowers(String userEmail) {
        return followMapper.countFollowers(userEmail);
    }

    @Override
    public int countFollowings(String userEmail) {
        return followMapper.countFollowings(userEmail);
    }

    @Override
    public boolean isFollowing(String followerEmail, String followingEmail) {
        int count = followMapper.isFollowing(followerEmail, followingEmail);
        return count > 0;
    }
}
