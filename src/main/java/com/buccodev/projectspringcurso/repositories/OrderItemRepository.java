package com.buccodev.projectspringcurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspringcurso.entities.OrderItem;
import com.buccodev.projectspringcurso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
	
}
