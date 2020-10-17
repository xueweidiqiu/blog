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
	
	private enum Sex {
		保密,男,女
	}
	
	//键值对版本
	/*
	public enum Sex {
		SECRET(0L,"保密"),
		MALE(1L,"男"),
		FEMALE(2L,"女");
		
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
	*/
	//值版本
	/*
	public enum Sex {
		SECRET("保密"),
		MALE("男"),
		FEMALE("女");
		
		private final String value;
		
		Sex(String value) {
			this.value = value;
		}

		public String getValue() {
			return value;
		}
		 	
	}
	*/
}
