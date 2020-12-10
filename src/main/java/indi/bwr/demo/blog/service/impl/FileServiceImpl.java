package indi.bwr.demo.blog.service.impl;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Service;

import indi.bwr.demo.blog.service.FileService;

@Service
public class FileServiceImpl implements FileService {

	@Override
	public InputStream readFromFileByPath(String filePath) {
		InputStream result1 = null;
		try {
			result1 = new FileInputStream(
								  new File( "target/blogContents/" + filePath )
								  );
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		
		try {
			BufferedReader reader = ( new BufferedReader(
									  new InputStreamReader(
									  new FileInputStream(
									  new File( "target/blogContents/" + filePath ))))
			);
			String line;
			while( null != ( line = reader.readLine() ) ) {
				result.write( line.getBytes() );
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return result1;
	}

}
