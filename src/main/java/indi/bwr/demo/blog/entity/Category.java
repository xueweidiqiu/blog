package indi.bwr.demo.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
	private Long id;
	private String name;
	private boolean isDelete;
	
}
