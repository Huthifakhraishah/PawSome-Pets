package com.axsos.pawesomepets.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.pawesomepets.models.ServicehasPet;
import com.axsos.pawesomepets.models.ServicehasPethasAppointment;

@Repository
public interface ServicehasPethasAppointmentRepository extends CrudRepository<ServicehasPethasAppointment, Long> {
	@Modifying
	@Transactional 
	@Query(value="INSERT INTO services_has_pets_has_appointments(service_has_pet_id,appointment_id,created_at) VALUES(?1,?2,CURDATE())",nativeQuery=true)
	public void fillTable(Long serviceHasPetId,Long appointmentId);

	@Modifying
	@Transactional
	@Query(value="DELETE FROM services_has_pets_has_appointments WHERE services_has_pets_has_appointments.service_has_pet_id IN ?1",nativeQuery=true)
	public void delete(List<ServicehasPet> myServicehasPet);
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM services_has_pets_has_appointments WHERE services_has_pets_has_appointments.appointment_id=?1",nativeQuery=true)
	public void deleteByAppointmentId(Long id);
	
	@Modifying
	@Transactional
	@Query(value="DELETE FROM services_has_pets_has_appointments WHERE services_has_pets_has_appointments.service_has_pet_id IN ?1",nativeQuery=true)
	public void deleteByServicehasPet(List<ServicehasPet> ServicehasPets);
}
