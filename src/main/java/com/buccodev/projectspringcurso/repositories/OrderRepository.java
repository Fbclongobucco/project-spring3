package com.buccodev.projectspringcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspringcurso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
