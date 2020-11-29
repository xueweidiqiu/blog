package indi.bwr.demo.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import indi.bwr.demo.blog.entity.LoginLog;

@Mapper
public interface LoginLogDao {
	public int save(LoginLog loginLog);
	public int update(LoginLog loginLog);
	public int deleteById(long id);
	public List<LoginLog> findAll();
	public LoginLog findById(long id);
}
