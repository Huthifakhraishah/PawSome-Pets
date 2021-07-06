package com.axsos.pawesomepets.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.Category;
import com.axsos.pawesomepets.models.PService;
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
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}
	public Category findCategoryById(Long id) {
		Optional<Category> myCategory = categoryRepository.findById(id);
		if(myCategory.isPresent()) {
			return myCategory.get();
		}else {
			return null;
		}
	}
	public Category updateCategory(String type , Long myId) {
		
		Category mycategory = categoryRepository.findCategoryById(myId);
		mycategory.setType(type);
		return categoryRepository.save(mycategory);
		
	}

	public void deleteCategory(Category category) {
		categoryRepository.delete(category);
	}
	
}
