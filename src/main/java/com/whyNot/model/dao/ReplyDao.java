package com.whyNot.model.dao;

import java.util.List;

import com.whyNot.model.dto.Reply;

public interface ReplyDao {
	
	//댓글 등록
	int registReply(Reply reply);
	
	//crew에 따라 댓글 목록 불러오기
	List<Reply> searchByCrewId(String crewId);


}
