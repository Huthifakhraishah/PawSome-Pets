package com.axsos.pawesomepets.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.pawesomepets.models.PService;

@Repository
public interface PServiceRepository extends CrudRepository<PService, Long> {
	List<PService> findAll();
	
	@Query(value="SELECT * FROM services WHERE services.id=?1",nativeQuery=true)
	PService findPServiceById(Long id);
	

}
