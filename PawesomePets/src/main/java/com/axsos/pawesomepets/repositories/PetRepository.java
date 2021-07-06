package com.axsos.pawesomepets.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.pawesomepets.models.Pet;

@Repository
public interface PetRepository extends CrudRepository<Pet, Long> {
	List<Pet> findAll();
	
	@Modifying
	@Transactional 
	@Query(value="DELETE FROM pets WHERE pets.pets_category=?1",nativeQuery=true)
	public void delete(Long category_id);

}
