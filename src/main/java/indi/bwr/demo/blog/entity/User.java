package indi.bwr.demo.blog.entity;

import java.sql.Time;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	private Long id;
	private Integer uid;
	private String account;
	private String password;
	private String name;
	private String email;
	private Sex sex;
	private Date birthday;
	private String avatorLocation;
	private String personalStatus;
	private Time registerTime;
	private boolean isDelete;
	
	public enum Sex {
		SECRET(0L,"±£ÃÜ"),
		MALE(1L,"ÄÐ"),
		FEMALE(2L,"Å®");
		
		private final Long key;
		private final String value;
		
		Sex(Long key, String value) {
			this.key = key;
			this.value = value;
		}

		public Long getKey() {
			return key;
		}

		public String getValue() {
			return value;
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(Long.toString(Sex.MALE.getKey()) + "---" + Sex.MALE.getValue());
	}
}
