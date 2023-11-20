package com.whyNot.model.service;

import java.util.List;

import com.whyNot.model.dto.UserCrew;

public interface UserCrewService {
	
	//내크루 가져오기
	List<UserCrew> selectMyCrew(String userId);

}
