package indi.bwr.demo.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import indi.bwr.demo.blog.entity.User;

@Mapper
public interface UserDao {
	public int save(User user);
	public int update(User user);
	public int deleteById(long id);
	public List<User> findAll();
	public User findById(long id);
}
