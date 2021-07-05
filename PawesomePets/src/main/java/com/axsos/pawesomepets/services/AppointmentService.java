package com.axsos.pawesomepets.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.Appointment;
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
}
