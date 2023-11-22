package com.whyNot.model.service;

import java.util.List;

import com.whyNot.model.dto.UserCrew;

public interface UserCrewService {
	
	//내 유형 가져오기
	List<UserCrew> selectMyCrew(String userId);
	
	//크루 가입하기
	int joinCrew(UserCrew uCrew);
	
	//내 크루 목록
	List<UserCrew> getMyCrewList(String userId);
}