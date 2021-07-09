package com.axsos.pawesomepets.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.ServicehasPet;
import com.axsos.pawesomepets.repositories.ServicehasPethasAppointmentRepository;

@Service
public class ServicehasPethasAppointmentService {
	private final ServicehasPethasAppointmentRepository servicehasPethasAppointmentRepository;
	public ServicehasPethasAppointmentService(ServicehasPethasAppointmentRepository servicehasPethasAppointmentRepository) {
		this.servicehasPethasAppointmentRepository=servicehasPethasAppointmentRepository;
	}
	
	public void fillTable(Long serviceHasPetId,Long appointmentId) {
		servicehasPethasAppointmentRepository.fillTable(serviceHasPetId, appointmentId);
	}
	
	public void delete(List<ServicehasPet> myServicehasPet) {
		servicehasPethasAppointmentRepository.delete(myServicehasPet);
	}
	
	public void deleteByAppointmentId(Long id) {
		servicehasPethasAppointmentRepository.deleteByAppointmentId(id);
	}
	
	public void deleteByServicehasPet(List<ServicehasPet> ServicehasPets) {
		servicehasPethasAppointmentRepository.deleteByServicehasPet(ServicehasPets);
	}
	
}
