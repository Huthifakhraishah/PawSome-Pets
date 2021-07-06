package com.axsos.pawesomepets.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.pawesomepets.models.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	
	@Query(value="SELECT * FROM categories WHERE categories.id=?1",nativeQuery=true)
	Category findCategoryById(Long categoryId);
	
	@Transactional
	@Modifying
	@Query(value="DELETE FROM categories WHERE categories.id=?1",nativeQuery=true)
	public void delete(Long id);
}

