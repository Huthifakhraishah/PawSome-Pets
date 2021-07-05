
package com.axsos.pawesomepets.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.PService;
import com.axsos.pawesomepets.repositories.PServiceRepository;

@Service
public class PServiceService {
	private final PServiceRepository pserviceRepository;
	public PServiceService(PServiceRepository pserviceRepository) {
		this.pserviceRepository=pserviceRepository;
	}
	
	public PService createPService(String name,String links) {
		PService myPService=new PService(name,links);
		return pserviceRepository.save(myPService);
	}
	
	public List<PService> findAll() {
		return pserviceRepository.findAll();
	}
}
