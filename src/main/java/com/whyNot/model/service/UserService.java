package com.whyNot.model.service;

import java.util.List;

import com.whyNot.model.dto.User;

public interface UserService {

	//사용자 등록
	int registUser(User user);
	
	//사용자 정보 (JWT 사용해서 어떻게 가져올지 고민해봐야함
	//일단 전에 id로 검색하던 대로 작성해둘게요
	List<User> searchById(String id);
}
