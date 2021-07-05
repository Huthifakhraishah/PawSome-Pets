package com.axsos.pawesomepets.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.pawesomepets.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
}
