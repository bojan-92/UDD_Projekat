package com.udd.services;

import com.udd.entities.Category;

public interface CategoryService {

	Iterable<Category> listAllCategories();

	Category getCategoryById(Integer id);

	Category saveCategory(Category category);

	void deleteCategory(Integer id);
}
