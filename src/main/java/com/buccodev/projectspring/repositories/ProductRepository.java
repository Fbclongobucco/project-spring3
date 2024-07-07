package com.buccodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
