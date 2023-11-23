package com.whyNot.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whyNot.model.dao.UserCrewDao;
import com.whyNot.model.dto.UserCrew;

@Service
public class UserCrewServiceImpl implements UserCrewService {
	
	@Autowired
	private UserCrewDao ucDao;

	@Override
	public List<UserCrew> selectMyCrew(String userId) {
		return ucDao.selectMyCrew(userId);
	}
	
	@Override
	public int joinCrew(UserCrew uCrew) {
		return ucDao.joinCrew(uCrew);
	}

	@Override
	public List<UserCrew> getMyCrewList(String userId) {
		return ucDao.getMyCrewList(userId);
	}

	@Override
	public int getCrewJoinMemberNum(String crewId) {
		return ucDao.getCrewJoinMemberNum(crewId);
	}

}
