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
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="pets")
public class Pet {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, max = 10)
    private String name;
    @NotNull
    @Size(min = 1, max = 20)
    private String gender;
    @NotNull
    private Integer age;
    private String links;
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    //Relationships
    @ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(
		name = "services_has_pets",
		joinColumns = @JoinColumn(name = "pet_id"),
		inverseJoinColumns = @JoinColumn(name = "service_id")
	)
	private List<PService> petservice;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="pets_category")
	private Category category;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="pets_user")
	private User user;
 // CONSTRUCTOR
	public Pet() {
}
	

	public Pet(User user,@NotNull @Size(min = 2, max = 10) String name, @NotNull @Size(min = 1, max = 20) String gender,
			@NotNull @Range(min = 5, max = 20) Integer age, Category category, String links) {
		this.user = user;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.category = category;
		this.links = links;
	}


	public Pet(Long id, @NotNull @Size(min = 2, max = 10) String name, @NotNull @Size(min = 1, max = 20) String gender,
			@NotNull @Range(min = 5, max = 20) Integer age, List<PService> petservice, Category category, User user) {
	
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.petservice = petservice;
		this.category = category;
		this.user = user;
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


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public List<PService> getPetservice() {
		return petservice;
	}


	public void setPetservice(List<PService> petservice) {
		this.petservice = petservice;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public User getUser() {
		return user;
	}

	public String getLinks() {
		return links;
	}

	public void setLinks(String links) {
		this.links = links;
	}

	public void setUser(User user) {
		this.user = user;
	}
	 // Methods
		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }

		@PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
}
