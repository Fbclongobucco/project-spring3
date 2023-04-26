package com.buccodev.projectspringcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspringcurso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
