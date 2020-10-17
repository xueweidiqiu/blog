package indi.bwr.demo.blog.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import indi.bwr.demo.blog.entity.Test;

@Repository
public interface TestDao {
	public Test findById(long id);
}
