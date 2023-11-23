package com.whyNot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.whyNot.model.dto.Article;
import com.whyNot.model.service.ArticleService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ArticleController {
	
	@Autowired
	private ArticleService aService;
	
	//전체목록
	@GetMapping("/article")
	public ResponseEntity<?> selectArticleAll(){
		
		List<Article> list = aService.selectArticleAll();
		
		//목록 못가져옴
		if(list == null || list.size() == 0)
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		
		return new ResponseEntity<List<Article>>(list,HttpStatus.OK);
		
	}

}
