package indi.bwr.demo.blog.dao;

import java.util.List;

import indi.bwr.demo.blog.entity.CommentLog;

public interface CommentLogDao {
	public int save(CommentLog commentLog);
	public int update(CommentLog commentLog);
	public int deleteById(long id);
	public List<CommentLog> findAll();
	public CommentLog findById(long id);
}
