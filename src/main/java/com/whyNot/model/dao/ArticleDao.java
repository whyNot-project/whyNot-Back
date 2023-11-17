package com.whyNot.model.dao;

import java.util.List;

import com.whyNot.model.dto.Article;

public interface ArticleDao {
	
	//아티클 전체 목록 가져오기
	List<Article> selectArticleAll();

}
