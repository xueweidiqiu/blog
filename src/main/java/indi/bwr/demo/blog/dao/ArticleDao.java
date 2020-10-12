package indi.bwr.demo.blog.dao;

import java.util.List;

import indi.bwr.demo.blog.entity.Article;

public interface ArticleDao {
	public int save(Article article);
	public int update(Article article);
	public int deleteById(long id);
	public List<Article> findAll();
	public Article findById(long id);
}
