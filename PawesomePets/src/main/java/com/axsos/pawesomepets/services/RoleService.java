package com.axsos.pawesomepets.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.axsos.pawesomepets.models.Role;
import com.axsos.pawesomepets.repositories.RoleRepository;

@Service
public class RoleService {
	private final RoleRepository roleRepository;
	public RoleService(RoleRepository roleRepository) {
		this.roleRepository=roleRepository;
	}

	public List<Role> findAll() {
		return roleRepository.findAll();
	}
}
