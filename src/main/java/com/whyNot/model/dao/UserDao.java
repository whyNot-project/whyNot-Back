package com.whyNot.model.dao;

import java.util.List;
import java.util.Map;

import com.whyNot.model.dto.User;

public interface UserDao {
	
	Map<String, Object> login(User user);
	
	//사용자 등록
	Integer registUser(User user);
	
	List<User> searchById(String id);
	
	
}
