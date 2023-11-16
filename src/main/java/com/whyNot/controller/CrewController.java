package com.whyNot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whyNot.model.dto.Crew;
import com.whyNot.model.dto.SearchCondition;
import com.whyNot.model.service.CrewService;

@RestController
@RequestMapping("/crewapi")
@CrossOrigin("*")
public class CrewController {
	
	@Autowired
	private CrewService cService;
	
	//등록
	@PostMapping("/crew")
	public ResponseEntity<?> registCrew(Crew crew){
		
		int check = cService.registCrew(crew);
		
		//실패
		if(check == 0)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	//수정
	@PutMapping("/crew")
	public ResponseEntity<?> updateCrew(Crew crew){
		
		int check = cService.updateCrew(crew);
		
		//실패
		if(check == 0)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//삭제
	@DeleteMapping("/crew")
	public ResponseEntity<?> deleteCrew(Crew crew){
		
		int check = cService.deleteCrew(crew);
		
		//실패
		if(check == 0)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	//검색
	@GetMapping("crew/search") //매핑 맞는지?
	public ResponseEntity<?> searchByCondition(SearchCondition condition){
		
		List<Crew> list = cService.searchByCondition(condition);
		
		//검색결과 없음
		if(list == null || list.size() == 0) 
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		//검색결과 있음, 리스트 반환
		return new ResponseEntity<List<Crew>>(list, HttpStatus.OK);
		
	}
	

}
