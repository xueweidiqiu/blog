package indi.bwr.demo.blog.entity;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginLog {
	private Long id;
	private Long userId;
	private Time lastIP;
	private Time lastLoginTime;
}
