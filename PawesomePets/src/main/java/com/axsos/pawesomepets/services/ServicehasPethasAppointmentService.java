package com.axsos.pawesomepets.services;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.ServicehasPethasAppointment;
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
	
	
}
