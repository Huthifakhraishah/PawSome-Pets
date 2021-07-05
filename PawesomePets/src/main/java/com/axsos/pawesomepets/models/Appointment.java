package com.axsos.pawesomepets.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Future;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "appointments")
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Future
	private Date appointment;
	
	@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "services_has_pets_has_appointments", 
        joinColumns = @JoinColumn(name = "appointment_id"), 
        inverseJoinColumns = @JoinColumn(name = "service_has_pet_id")
    )
    private List<ServicehasPet> serviceshaspets;
	
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	
	public Appointment() {
	}
	
	public Appointment(Date appointment) {
		this.appointment=appointment;
	}

	public Date getAppointment() {
		return appointment;
	}

	public void setAppointment(Date appointment) {
		this.appointment = appointment;
	}

	public List<ServicehasPet> getServiceshaspets() {
		return serviceshaspets;
	}

	public void setServiceshaspets(List<ServicehasPet> serviceshaspets) {
		this.serviceshaspets = serviceshaspets;
	}

	public Long getId() {
		return id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
}
