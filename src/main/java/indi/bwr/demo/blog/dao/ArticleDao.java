package indi.bwr.demo.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import indi.bwr.demo.blog.entity.Article;

@Mapper
public interface ArticleDao {
	public int save(Article article);
	public int update(Article article);
	public int deleteById(long id);
	public List<Article> findAll();
	public Article findById(long id);
}
