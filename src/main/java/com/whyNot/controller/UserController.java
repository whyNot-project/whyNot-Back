package com.whyNot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whyNot.model.dto.User;
import com.whyNot.model.service.UserService;

@RestController
@RequestMapping("/userapi")
@CrossOrigin("*") //이 뒤에 origins, methods 추가해야할까?
public class UserController {
	
	@Autowired
	private UserService uService;
	
	//등록
	@PostMapping("/user")
	public ResponseEntity<?> registUser(User user){
		int check = uService.registUser(user);
		
		//실패
		if(check == 0)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//사용자 정보 (JWT 사용해서 어떻게 가져올지 고민해봐야함
	//일단 전에 id로 검색하던 대로 작성해둘게요
	//사용자 정보
	@GetMapping("user/{id}") //매핑 맞는지?
	public ResponseEntity<?> searhchById(@PathVariable String id){
		
		List<User> list = uService.searchById(id);
		
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
		
	}

	
}
