package indi.bwr.demo.blog.dao;

import java.util.List;

import indi.bwr.demo.blog.entity.Comment;

public interface CommentDao {
	public int save(Comment comment);
	public int update(Comment comment);
	public int deleteById(long id);
	public List<Comment> findAll();
	public Comment findById(long id);
}
