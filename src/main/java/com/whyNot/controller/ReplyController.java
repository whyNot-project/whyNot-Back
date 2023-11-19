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

import com.whyNot.model.dto.Reply;
import com.whyNot.model.service.ReplyService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ReplyController {
	
	@Autowired
	private ReplyService rService;
	
	//등록
	@PostMapping("/reply")
	public ResponseEntity<?> registReply(Reply reply){
		
		int check = rService.registReply(reply);
		
		//등록 실패
		if(check == 0)
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		
		//성공
		return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	//crew에 따라 댓글 목록 불러오기
	@GetMapping("reply/{id}") //매핑 맞는지?
	public ResponseEntity<?> searchByCrewId(int crewId){
		
		List<Reply> list = rService.searchByCrewId(crewId);
		
		//목록 없음
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Reply>>(list, HttpStatus.OK);
	}

}
