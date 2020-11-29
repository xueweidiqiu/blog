package indi.bwr.demo.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import indi.bwr.demo.blog.entity.CommentLog;

@Mapper
public interface CommentLogDao {
	public int save(CommentLog commentLog);
	public int update(CommentLog commentLog);
	public int deleteById(long id);
	public List<CommentLog> findAll();
	public CommentLog findById(long id);
}
