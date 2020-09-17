package indi.bwr.demo.blog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello2")
public class HelloController {
	@RequestMapping("")
	public String hello() {
		return "helloworld2";
	}
}
