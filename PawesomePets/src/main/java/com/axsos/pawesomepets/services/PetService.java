package com.axsos.pawesomepets.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.Category;
import com.axsos.pawesomepets.models.PService;
import com.axsos.pawesomepets.models.Pet;
import com.axsos.pawesomepets.models.User;
import com.axsos.pawesomepets.repositories.CategoryRepository;
import com.axsos.pawesomepets.repositories.PetRepository;

@Service
public class PetService {
	private final PetRepository petRepository;
	private final CategoryRepository categoryRepository;
	public PetService(PetRepository petRepository,CategoryRepository categoryRepository) {
		this.petRepository=petRepository;
		this.categoryRepository=categoryRepository;
	}
	
	public Pet createPet(User currentUser,String name,String gender,Integer age,Long categoryId,String links) {
		Category category=categoryRepository.findCategoryById(categoryId);
		Pet myPet=new Pet(currentUser,name,gender,age,category,links);
		return petRepository.save(myPet);
	}
	public List<Pet> findAll() {
		return petRepository.findAll();
	}
	
	public void delete(Long id) {
		petRepository.delete(id);
	}
	
	public Pet findPetById(Long id) {
		return petRepository.findPetById(id);
	}
}
