package indi.bwr.demo.blog.entity;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleReadLog {
	private Long id;
	private Long articleId;
	private Long userId;
	private Time readTime;
}
