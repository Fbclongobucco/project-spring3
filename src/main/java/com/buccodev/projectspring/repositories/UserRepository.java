package com.buccodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
