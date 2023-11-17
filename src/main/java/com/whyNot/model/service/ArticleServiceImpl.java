package com.whyNot.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whyNot.model.dao.ArticleDao;
import com.whyNot.model.dto.Article;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired
	private ArticleDao aDao;

	@Override
	public List<Article> selectArticleAll() {
		return aDao.selectArticleAll();
	}
	
	

}
