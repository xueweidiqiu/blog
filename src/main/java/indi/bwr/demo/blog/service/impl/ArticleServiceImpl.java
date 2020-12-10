package indi.bwr.demo.blog.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indi.bwr.demo.blog.dao.ArticleDao;
import indi.bwr.demo.blog.entity.Article;
import indi.bwr.demo.blog.service.ArticleService;
import indi.bwr.demo.blog.service.FileService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;
	@Autowired
	private FileService fileService;

	@Override
	public List<Article> getArticleList() {
		return articleDao.findAll();
	}

	@Override
	public InputStream getContentByLocation(Article article) {
		System.out.println("½øÈëserverimpl");
		if( (null != article) && (null != article.getId()) ) {
			return fileService.readFromFileByPath( articleDao.findById(
											Long.parseLong( 
											article.getId().toString())
											).getContentLocation()
					);
		}
		return null;
	}

}
