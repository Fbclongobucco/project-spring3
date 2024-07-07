package com.buccodev.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buccodev.projectspring.entities.OrderItem;
import com.buccodev.projectspring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

	
	
}
