package com.axsos.pawesomepets.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.pawesomepets.models.ServicehasPethasAppointment;

@Repository
public interface ServicehasPethasAppointmentRepository extends CrudRepository<ServicehasPethasAppointment, Long> {
	@Modifying
	@Transactional 
	@Query(value="INSERT INTO services_has_pets_has_appointments(service_has_pet_id,appointment_id,created_at) VALUES(?1,?2,CURDATE())",nativeQuery=true)
	public void fillTable(Long serviceHasPetId,Long appointmentId);
}
