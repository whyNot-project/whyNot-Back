package com.whyNot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whyNot.model.dto.UserCrew;
import com.whyNot.model.service.UserCrewService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class UserCrewController {

	@Autowired
	private UserCrewService ucService;
	
	@GetMapping("/userCrew/{userId}")
	public ResponseEntity<?> selectMyCrew(@PathVariable String userId){
		
		List<UserCrew> list = ucService.selectMyCrew(userId);
		
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<UserCrew>>(list, HttpStatus.OK);
		
	}
}