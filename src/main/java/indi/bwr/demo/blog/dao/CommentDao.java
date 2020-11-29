package indi.bwr.demo.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import indi.bwr.demo.blog.entity.Comment;

@Mapper
public interface CommentDao {
	public int save(Comment comment);
	public int update(Comment comment);
	public int deleteById(long id);
	public List<Comment> findAll();
	public Comment findById(long id);
}
