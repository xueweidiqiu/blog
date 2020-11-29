package indi.bwr.demo.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import indi.bwr.demo.blog.entity.ArticleReadLog;

@Mapper
public interface ArticleReadLogDao {
	public int save(ArticleReadLog articleReadLog);
	public int update(ArticleReadLog articleReadLog);
	public int deleteById(long id);
	public List<ArticleReadLog> findAll();
	public ArticleReadLog findById(long id);
}
