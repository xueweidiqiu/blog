package indi.bwr.demo.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import indi.bwr.demo.blog.service.TestService;

@RestController
@RequestMapping("/Test")
public class TestController {

	@Autowired
	private TestService service;
	
	@RequestMapping("/forDev")
	public String findById() {
		int id = 2;
		return service.find(id).toString();
	}
	
	@RequestMapping("/articleTest")
	public String articleTest() {
		service.articleTest();
		return "³É¹¦";
	}
	
}
