package com.whyNot.model.service;

import java.util.List;

import com.whyNot.model.dto.Article;

public interface ArticleService {
	
	//아티클 전체 목록 가져오기
	List<Article> selectArticleAll();


}
