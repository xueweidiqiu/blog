package indi.bwr.demo.blog.entity;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentLog {
	private Long id;
	private Long commentId;
	private Time createTime;
}
