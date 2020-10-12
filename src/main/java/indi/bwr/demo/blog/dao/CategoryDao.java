package indi.bwr.demo.blog.dao;

import java.util.List;

import indi.bwr.demo.blog.entity.Category;

public interface CategoryDao {
	public int save(Category category);
	public int update(Category category);
	public int deleteById(long id);
	public List<Category> findAll();
	public Category findById(long id);
}
