package com.whyNot.model.dto;

public class Article {
	
	private int articleId;
	private String articleTitle;
	private String articleContent;
	private String articleThumbnail;
	private String articleUrl;
	
	public Article() {
	}

	public Article(int articleId, String articleTitle, String articleContent, String articleThumbnail,
			String articleUrl) {
		super();
		this.articleId = articleId;
		this.articleTitle = articleTitle;
		this.articleContent = articleContent;
		this.articleThumbnail = articleThumbnail;
		this.articleUrl = articleUrl;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleThumbnail() {
		return articleThumbnail;
	}

	public void setArticleThumbnail(String articleThumbnail) {
		this.articleThumbnail = articleThumbnail;
	}

	public String getArticleUrl() {
		return articleUrl;
	}

	public void setArticleUrl(String articleUrl) {
		this.articleUrl = articleUrl;
	}

	@Override
	public String toString() {
		return "Article [articleId=" + articleId + ", articleTitle=" + articleTitle + ", articleContent="
				+ articleContent + ", articleThumbnail=" + articleThumbnail + ", articleUrl=" + articleUrl + "]";
	}


}
