package com.whyNot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whyNot.model.dto.User;
import com.whyNot.model.service.UserService;
import com.whyNot.util.JwtUtil;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
@CrossOrigin("*") //이 뒤에 origins, methods 추가해야할까?
public class UserController {
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/login")
	@Operation(summary = "로그인", description = "유저아이디과 비밀번호를 이용하여 액세스 토큰을 반환합니다.")
	public ResponseEntity<Map<String, Object>> login(@RequestBody User user) {
		Map<String, Object> result = new HashMap<String, Object>();
		
		//User Service -> dao -> DB 로 실제 유저인지 확인
		List<User> list = uService.searchById(user.getUserId());
		
		HttpStatus status = null;
		
		//list의 password가 같다면 로그인 성공
		if(user.getUserId() != null && user.getPassword() != null && 
				list.get(0).getPassword().equals(user.getPassword())) {
			result.put("access-token",  jwtUtil.createToken("id",  user.getUserId()));
			result.put("message", "로그인 성공");
			result.put("nickname", list.get(0).getNickname());
			status = HttpStatus.OK;
		} else {
			result.put("message", "로그인 실패");
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return new ResponseEntity<Map<String, Object>>(result, status);
	}
	
	//등록
	@PostMapping("/user")
	public ResponseEntity<?> registUser(@RequestBody User user){
		Integer check = uService.registUser(user);

		//실패
		if(check == 0)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//사용자 정보
	@GetMapping("user/{id}") //매핑 맞는지?
	public ResponseEntity<?> searhchById(@PathVariable String id){
		
		List<User> list = uService.searchById(id);
		
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<User>>(list, HttpStatus.OK);
		
	}

	
}
