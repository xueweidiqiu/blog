package indi.bwr.demo.blog.dao;

import java.sql.Time;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import indi.bwr.demo.blog.entity.Article;

public class DaoTest {
	@Autowired
	private ArticleDao dao;
	
	@Test
	public void articleDaoTest() {
		Article article = new Article(Long.valueOf(3L),Long.valueOf(2L),"111","123",Long.valueOf(5L),Integer.valueOf(12),Time.valueOf("2020-05-01"),Time.valueOf("2021-06-30"),false);
		dao.save(article);
		Article article2 = dao.findById(3L);
		System.out.println(article2);
	}

}
