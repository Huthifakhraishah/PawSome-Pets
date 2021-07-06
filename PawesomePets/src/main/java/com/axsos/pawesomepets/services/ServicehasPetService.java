package com.axsos.pawesomepets.services;

import java.util.List;

import org.springframework.stereotype.Service;

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
	
}
