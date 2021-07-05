package com.axsos.pawesomepets.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.Appointment;
import com.axsos.pawesomepets.models.PService;
import com.axsos.pawesomepets.repositories.AppointmentRepository;

@Service
public class AppointmentService {
	private final AppointmentRepository appointmentRepository;
	public AppointmentService(AppointmentRepository appointmentRepository) {
		this.appointmentRepository=appointmentRepository;
	}
	
	public Appointment createAppointment(Date appointment) {
		Appointment myAppointment=new Appointment(appointment);
		return appointmentRepository.save(myAppointment);
	}
	
	public List<Appointment> findAll(){
		return appointmentRepository.findAll();
	}

	public Appointment findAppointmentById(Long id) {
		Optional<Appointment> myAppointment = appointmentRepository.findById(id);
		if(myAppointment.isPresent()) {
			return myAppointment.get();
		}else {
			return null;
		}
	}
	public void updateService(Appointment myAppointment) {
		appointmentRepository.save(myAppointment);
	}

	public void deleteService(Appointment appointment) {
		appointmentRepository.delete(appointment);
	}
}

