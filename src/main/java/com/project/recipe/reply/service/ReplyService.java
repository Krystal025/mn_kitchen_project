package com.project.recipe.reply.service;

import com.project.recipe.reply.dto.ReplyDto;

import java.util.List;

public interface ReplyService {
    void saveReply(ReplyDto dto);

    void updateReply(ReplyDto dto);

    void deleteReply(int rplNum);

    List<ReplyDto> getRplList(int rcpNum);

    List<ReplyDto> getMyRplList(int userNum);
}
