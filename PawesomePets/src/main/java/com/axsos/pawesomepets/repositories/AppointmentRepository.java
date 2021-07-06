package com.axsos.pawesomepets.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.pawesomepets.models.Appointment;

@Repository
public interface AppointmentRepository  extends CrudRepository<Appointment, Long> {
	List<Appointment> findAll();
	
	@Query(value="SELECT * FROM appointments WHERE appointments.id=?1",nativeQuery=true)
	Appointment findAppointmentById(Long id);
}
