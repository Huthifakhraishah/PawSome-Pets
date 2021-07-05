package com.axsos.pawesomepets.services;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.Category;
import com.axsos.pawesomepets.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository=categoryRepository;
	}
	
	public Category createCategory(String type) {
		Category myCategory=new Category(type);
		return categoryRepository.save(myCategory);
	}
	
	
}
