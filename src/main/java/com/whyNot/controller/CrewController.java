package com.whyNot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.whyNot.model.dto.Crew;
import com.whyNot.model.dto.SearchCondition;
import com.whyNot.model.service.CrewService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CrewController {
	
	@Autowired
	private CrewService cService;
	
	//등록
	@PostMapping("/crew")
	public ResponseEntity<?> registCrew(@RequestBody Crew crew){
		
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
	@DeleteMapping("/crew/{crewId}")
	public ResponseEntity<?> deleteCrew(@PathVariable int crewId){
		//참조하고 있는 user_crew 테이블 삭제
		cService.deleteUserCrew(crewId);
		int check2 = cService.deleteCrew(crewId);
		//실패
		if(check2 == 0)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	
	//전체 목록
	@GetMapping("crew")
	public ResponseEntity<?> selectCrewAll(){
		
		List<Crew> list = cService.selectCrewAll();
		
		//실패
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		//성공
		return new ResponseEntity<List<Crew>>(list, HttpStatus.OK);
		
	}
	
	//크루 상세
	@GetMapping("/crew/{crewId}")
	public ResponseEntity<?> detailCrew(@PathVariable int crewId){
		
		Crew crew = cService.detailCrew(crewId);
		
		//해당하는 크루 없음
		if(crew == null)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		//크루 가져옴
		return new ResponseEntity<Crew>(crew, HttpStatus.OK);
		
		
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
