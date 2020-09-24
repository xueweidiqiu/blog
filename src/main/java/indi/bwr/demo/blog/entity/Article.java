package indi.bwr.demo.blog.entity;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
	private Long id;
	private Long userId;
	private String title;
	private String contentLocation;
	private Long categoryId;
	private Integer readingVolume;
	private Time createTime;
	private Time lastChangeTime;
	private boolean isDelete;
}
