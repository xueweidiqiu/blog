package indi.bwr.demo.blog.entity;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommentReply {
	private Long id;
	private Long commentReplyId;
	private Long commentId;
}
