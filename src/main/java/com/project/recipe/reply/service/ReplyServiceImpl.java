package com.project.recipe.reply.service;

import com.project.recipe.reply.dao.ReplyMapper;
import com.project.recipe.reply.dto.ReplyDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService {

    private final ReplyMapper rplMapper;

    //댓글 저장
    @Override
    public void saveReply(ReplyDto dto) {
        rplMapper.insertRpl(dto);
    }

    //댓글 수정
    @Override
    public void updateReply(ReplyDto dto) {
        rplMapper.updateRpl(dto);
    }

    //댓글 삭제
    @Override
    public void deleteReply(int rplNum) {
        rplMapper.deleteRpl(rplNum);
    }

    //게시글 댓글 목록 조회
    @Override
    public List<ReplyDto> getRplList(int rcpNum) {
        ReplyDto dto = new ReplyDto();
        dto.setRcpNum(rcpNum);
        //해당 게시글 번호에 대한 댓글 목록 조회
        List<ReplyDto> rplList = rplMapper.getRplList(rcpNum);
        //댓글 목록 반환
        return rplList;
    }

    //나의 댓글 목록 조회
    @Override
    public List<ReplyDto> getMyRplList(int userNum) {
        //dto 객체에 사용자로부터 받은 userNum과 rcpNum 저장
        ReplyDto dto = new ReplyDto();
        dto.setUserNum(userNum);
        //특정 사용자가 작성한 댓글에 대한 게시글 목록 조회
        List<ReplyDto> myRplList = rplMapper.getMyRplList(userNum);
        //나의 댓글 목록 반환
        return myRplList;
    }
}