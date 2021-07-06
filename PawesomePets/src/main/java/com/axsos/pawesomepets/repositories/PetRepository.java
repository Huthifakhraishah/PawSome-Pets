package com.axsos.pawesomepets.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.axsos.pawesomepets.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
	List<Pet> findAll();
	
	

}
