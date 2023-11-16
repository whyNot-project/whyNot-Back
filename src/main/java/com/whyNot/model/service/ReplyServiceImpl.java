package com.whyNot.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whyNot.model.dao.ReplyDao;
import com.whyNot.model.dto.Reply;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	@Autowired
	private ReplyDao rDao;

	@Override
	public int registReply(Reply reply) {
		return rDao.registReply(reply);
	}

	@Override
	public List<Reply> searchByCrewId(String crewId) {
		return rDao.searchByCrewId(crewId);
	}
	

}
