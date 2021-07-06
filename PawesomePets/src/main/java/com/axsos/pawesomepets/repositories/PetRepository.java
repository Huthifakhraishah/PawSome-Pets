package com.axsos.pawesomepets.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.axsos.pawesomepets.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
	List<Pet> findAll();
	
	@Transactional
	@Modifying
	@Query(value="DELETE FROM pets WHERE pets.pets_category=?1",nativeQuery=true)
	public void delete(Long id);

	@Query(value="SELECT * FROM pets WHERE pets.id=?1",nativeQuery=true)
	public Pet findPetById(Long id);
}
