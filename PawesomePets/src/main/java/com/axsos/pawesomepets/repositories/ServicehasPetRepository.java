package com.axsos.pawesomepets.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.pawesomepets.models.Pet;
import com.axsos.pawesomepets.models.ServicehasPet;

@Repository
public interface ServicehasPetRepository extends CrudRepository<ServicehasPet, Long>{
	@Modifying
	@Transactional 
	@Query(value="INSERT INTO services_has_pets(services_has_pets.pet_id,services_has_pets.service_id,services_has_pets.created_at) VALUES(?1,?2,CURDATE())",nativeQuery=true)
	void fillTable(Long petId,Long serviceId);
	
	@Query(value="SELECT * FROM services_has_pets WHERE services_has_pets.pet_id=?1 AND services_has_pets.service_id=?2 LIMIT 1",nativeQuery=true)
	ServicehasPet findByTwoIds(Long petId,Long serviceId);
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM services_has_pets WHERE services_has_pets.service_id=?1",nativeQuery=true)
	public void delete(Long id);
	
	@Query(value="SELECT * FROM services_has_pets WHERE services_has_pets.service_id=?1",nativeQuery=true)
	public List<ServicehasPet> findByAnId(Long id);
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM services_has_petsWHERE services_has_pets.pet_id=?1",nativeQuery=true)
	public void deleteByCategoryId(Long id);
	
	@Query(value="SELECT * FROM services_has_pets WHERE services_has_pets.pet_id IN ?1",nativeQuery=true)
	public List<ServicehasPet> findByPets(List<Pet> pets);
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM services_has_pets WHERE services_has_pets.pet_id IN ?1",nativeQuery=true)
	public void deleteByPet(List<Pet> pets);
}
