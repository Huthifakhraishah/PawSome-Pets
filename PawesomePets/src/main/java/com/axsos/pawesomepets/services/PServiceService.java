
package com.axsos.pawesomepets.services;

import java.util.List;
import java.util.Optional;

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


	public PService findServiceById(Long id) {
		Optional<PService> myService = pserviceRepository.findById(id);
		if(myService.isPresent()) {
			return myService.get();
		}else {
			return null;
		}
	}
	public PService updateService(String name,Long myId) {
		PService service = pserviceRepository.findPServiceById(myId);
		service.setName(name);
		return pserviceRepository.save(service);
	}

	public void deleteService(PService service) {
		pserviceRepository.delete(service);
	}
}
