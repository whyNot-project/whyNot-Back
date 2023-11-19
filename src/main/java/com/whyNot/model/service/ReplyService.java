package com.whyNot.model.service;

import java.util.List;

import com.whyNot.model.dto.Reply;

public interface ReplyService {
	
	//댓글 등록
	int registReply(Reply reply);
	
	//crew에 따라 댓글 목록 불러오기
	List<Reply> searchByCrewId(int crewId);

}
