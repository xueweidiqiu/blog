package indi.bwr.demo.blog.dao;

import java.util.List;

import indi.bwr.demo.blog.entity.CommentReply;

public interface CommentReplyDao {
	public int save(CommentReply commentReply);
	public int update(CommentReply commentReply);
	public int deleteById(long id);
	public List<CommentReply> findAll();
	public CommentReply findById(long id);
}
