package indi.bwr.demo.blog.controller;

import java.util.List;

import org.mybatis.spring.MyBatisSystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import indi.bwr.demo.blog.dao.UserDao;
import indi.bwr.demo.blog.entity.User;

@Controller
@RequestMapping("hello2")
public class HelloController {
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("1")
	public java.lang.String hello() {
		return "helloworld2";
	}
	@RequestMapping("tfmb")
	@ResponseBody
	public List<User> getted() {
		try {
			return userDao.findAll();
		} catch (MyBatisSystemException myBatisEx) {
			myBatisEx.printStackTrace();
			System.err.println("请确定数据库User表中存储的性别信息是否正确。");
		}
		return null;
	}
}
