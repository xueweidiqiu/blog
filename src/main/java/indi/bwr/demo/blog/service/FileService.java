package indi.bwr.demo.blog.service;

import java.io.InputStream;

import org.springframework.stereotype.Service;

@Service
public interface FileService {
	
	public InputStream readFromFileByPath(String filePath);
	
}
