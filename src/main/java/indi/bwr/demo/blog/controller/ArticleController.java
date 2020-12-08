package indi.bwr.demo.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import indi.bwr.demo.blog.entity.Article;
import indi.bwr.demo.blog.service.ArticleService;

@RestController
@RequestMapping("/Article")
@CrossOrigin
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/getList")
	public List<Article> getArticleList() {
		return articleService.getArticleList();
	}

}
