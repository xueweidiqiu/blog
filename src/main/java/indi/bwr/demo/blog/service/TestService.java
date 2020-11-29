package indi.bwr.demo.blog.service;

import java.sql.Time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.bwr.demo.blog.dao.ArticleDao;
import indi.bwr.demo.blog.dao.TestDao;
import indi.bwr.demo.blog.entity.Article;
import indi.bwr.demo.blog.entity.Test;

@Service
public class TestService {
	@Autowired
	private TestDao dao;
	@Autowired
	private ArticleDao articleDao;
	
	public Test find(long id) {
		return dao.findById(id);
	}
	
	public Article articleTest() {
		try {
			//Article article = new Article(Long.valueOf(3L),Long.valueOf(2L),"111","123",Long.valueOf(5L),Integer.valueOf(12),null,null,false);
			//articleDao.save(article);
			Article article2 = articleDao.findById(3L);
			System.out.println(article2);
			return article2;
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
			return null;
		}
	}
}
