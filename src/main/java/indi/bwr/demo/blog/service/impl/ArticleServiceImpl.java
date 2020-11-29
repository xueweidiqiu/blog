package indi.bwr.demo.blog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.bwr.demo.blog.dao.ArticleDao;
import indi.bwr.demo.blog.entity.Article;
import indi.bwr.demo.blog.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;

	@Override
	public List<Article> getArticleList() {
		return articleDao.findAll();
	}

}
