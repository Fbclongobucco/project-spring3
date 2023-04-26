package com.buccodev.projectspringcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspringcurso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
