package indi.bwr.demo.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.bwr.demo.blog.dao.TestDao;
import indi.bwr.demo.blog.entity.Test;

@Service
public class TestService {
	@Autowired
	private TestDao dao;
	
	public Test find(long id) {
		return dao.findById(id);
	}
}
