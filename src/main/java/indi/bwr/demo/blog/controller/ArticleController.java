package indi.bwr.demo.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import indi.bwr.demo.blog.entity.Article;
import indi.bwr.demo.blog.service.ArticleService;

@Controller
@RequestMapping("/Article")
public class ArticleController {
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/getList")
	public List<Article> getArticleList() {
		return articleService.getArticleList();
	}

}
