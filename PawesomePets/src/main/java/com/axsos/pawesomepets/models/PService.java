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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "services")
@Entity
public class PService {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	@Size(min = 2, max = 50)
	private String name;
	private String links;
	private String description;
	@Column(updatable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date createdAt;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedAt;
	// Relationships
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "services_has_pets", joinColumns = @JoinColumn(name = "service_id"), inverseJoinColumns = @JoinColumn(name = "pet_id"))
	private List<Pet> servicepets;

	// CONSTRUCTOR
	public PService() {
	}

	public PService(String name) {
		this.name = name;
	}

	public PService(@NotNull @Size(min = 2, max = 50) String name, String links, String description) {
		this.name = name;
		this.links = links;
		this.description = description;
	}

	public PService(Long id, @NotNull @Size(min = 2, max = 10) String name, List<Pet> servicepets) {

		this.id = id;
		this.name = name;
		this.servicepets = servicepets;
	}

	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Pet> getServicepets() {
		return servicepets;
	}

	public void setServicepets(List<Pet> servicepets) {
		this.servicepets = servicepets;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Methods
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}

}
