package indi.bwr.demo.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import indi.bwr.demo.blog.entity.Article;
import indi.bwr.demo.blog.service.ArticleService;
import indi.bwr.demo.blog.service.TestService;

@RestController
@RequestMapping("/Test")
public class TestController {

	@Autowired
	private TestService service;
	@Autowired
	private ArticleService articleService;
	
	@RequestMapping("/forDev")
	public String findById() {
		int id = 2;
		return service.find(id).toString();
	}
	
	@RequestMapping("/articleTest")
	public Article articleTest() {
		return service.articleTest();
	}
	
	@RequestMapping("/getArticleList")
	public List<Article> getAtyList() {
		return articleService.getArticleList();
	}
	
}
