package com.udd.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.udd.entities.Category;
import com.udd.services.CategoryService;

@Controller
public class CategoryController {

	private CategoryService categoryService;

	@Autowired
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@RequestMapping("category/new")
	public String newCategory(Model model) {
		model.addAttribute("category", new Category());
		return "categoryAdd";
	}

	@RequestMapping(value = "/categories", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("categories", categoryService.listAllCategories());
		System.out.println("Returning categories:");
		return "categories";
	}

	@RequestMapping("category/{id}")
	public String showCategory(@PathVariable Integer id, Model model) {
		model.addAttribute("category", categoryService.getCategoryById(id));
		return "categoryShow";
	}

	/*@RequestMapping("user/edit/{id}")
	public String edit(@PathVariable Integer id, Model model) {
		model.addAttribute("user", userService.getUserById(id));
		return "userEdit";
	}*/

	@RequestMapping(value = "/category", method = RequestMethod.POST)
	public String saveCategory(Category category) {
		categoryService.saveCategory(category);
		return "redirect:/category/" + category.getId();
	}

}
