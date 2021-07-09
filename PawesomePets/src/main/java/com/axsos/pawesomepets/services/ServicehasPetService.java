package com.axsos.pawesomepets.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.Pet;
import com.axsos.pawesomepets.models.ServicehasPet;
import com.axsos.pawesomepets.repositories.ServicehasPetRepository;

@Service
public class ServicehasPetService {
	private final ServicehasPetRepository servicehasPetRepository;
	public ServicehasPetService(ServicehasPetRepository servicehasPetRepository) {
		this.servicehasPetRepository=servicehasPetRepository;
	}
	
	public void fillTable(Long petId,Long serviceId) {
		servicehasPetRepository.fillTable(petId,serviceId);
	}
	
	public ServicehasPet findByTwoIds(Long petId,Long serviceId) {
		return servicehasPetRepository.findByTwoIds(petId,serviceId);
	}
	
	public void delete(Long id) {
		servicehasPetRepository.delete(id);
	}
	
	public List<ServicehasPet> findByAnId(Long id) {
		return servicehasPetRepository.findByAnId(id);
	}
	
	public void deleteByCategoryId(Long id) {
		servicehasPetRepository.deleteByCategoryId(id);
	}
	
	public List<ServicehasPet> findByPets(List<Pet> pets){
		return servicehasPetRepository.findByPets(pets);
	}
	
	public void deleteByPet(List<Pet> pets) {
		servicehasPetRepository.deleteByPet(pets);
	}
	
}
