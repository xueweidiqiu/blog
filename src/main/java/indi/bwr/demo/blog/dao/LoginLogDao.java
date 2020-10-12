package indi.bwr.demo.blog.dao;

import java.util.List;

import indi.bwr.demo.blog.entity.LoginLog;

public interface LoginLogDao {
	public int save(LoginLog loginLog);
	public int update(LoginLog loginLog);
	public int deleteById(long id);
	public List<LoginLog> findAll();
	public LoginLog findById(long id);
}
