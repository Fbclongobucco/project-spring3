package com.buccodev.projectspringcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspringcurso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
