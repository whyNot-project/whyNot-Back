package com.whyNot.model.dao;

import java.util.List;

import com.whyNot.model.dto.UserCrew;

public interface UserCrewDao {
	
	//내크루 가져오기
	List<UserCrew> selectMyCrew(String userId);
	

}
