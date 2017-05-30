package com.niit.devops.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.devops.dao.CategoryDao;
import com.niit.devops.model.Category;
@Service
public class CategoryServiceImpl implements CategoryService{
	@Autowired
private CategoryDao categoryDao;
	public List<Category> getAllCategories() {
		return categoryDao.getAllCategories();
	}
}
