package com.whyNot.model.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whyNot.model.dao.UserDao;
import com.whyNot.model.dto.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao uDao;
	
	@Override
	public Map<String, Object> login(User user) {
		return uDao.login(user);
	}
	
	@Override
	public Integer registUser(User user) {
		return uDao.registUser(user);
	}

	//사용자 정보 (JWT 사용해서 어떻게 가져올지 고민해봐야함
	//일단 전에 id로 검색하던 대로 작성해둘게요
	@Override
	public List<User> searchById(String id) {
		return uDao.searchById(id);
	}
	
	

}
