package indi.bwr.demo.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
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
	
	@RequestMapping("/getContent")
	public ResponseEntity<InputStreamResource> getContentByArticle(Article article) {
		//System.out.println("进入controller");
		
		return new ResponseEntity<InputStreamResource>( 
						new InputStreamResource(
								articleService.getContentByLocation(article)
						), 
						HttpStatus.OK
				);
				
	}
	
	@RequestMapping("/getFile")
	public ResponseEntity<InputStreamResource> getFileByArticle(Article article) {
		/*返回文件*/
		String fileName = "blogContent.txt";
		
        HttpHeaders headers = new HttpHeaders();  
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");  
        headers.add("Content-Disposition", String.format("attachment; filename=\"%s\"", fileName));  
        headers.add("Pragma", "no-cache");  
        headers.add("Expires", "0");  
  
        return ResponseEntity
                .ok()  
                .headers(headers)  
                //.contentLength(file.contentLength())  
                .contentType(MediaType.parseMediaType("application/octet-stream"))
                .body(
                		new InputStreamResource(
								articleService.getContentByLocation(article)
						)
                	);
		/*返回文件结束*/
	}

}
