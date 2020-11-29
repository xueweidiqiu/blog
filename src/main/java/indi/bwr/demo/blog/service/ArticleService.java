package indi.bwr.demo.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import indi.bwr.demo.blog.entity.Article;

@Service
public interface ArticleService {
	public List<Article> getArticleList();
}
