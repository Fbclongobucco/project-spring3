package com.buccodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
