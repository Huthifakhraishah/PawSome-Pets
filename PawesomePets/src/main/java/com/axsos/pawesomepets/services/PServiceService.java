
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
	
	public PService createPService(String name,String links,String description) {
		PService myPService=new PService(name,links,description);
		return pserviceRepository.save(myPService);
	}
	
	public List<PService> findAll() {
		return pserviceRepository.findAll();
	}
	
	public PService findPServiceById(Long id) {
		return pserviceRepository.findPServiceById(id);
	}
}
