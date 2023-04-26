package com.buccodev.projectspringcurso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.buccodev.projectspringcurso.entities.Order;
import com.buccodev.projectspringcurso.entities.User;
import com.buccodev.projectspringcurso.entities.enuns.OrderStatus;
import com.buccodev.projectspringcurso.repositories.OrderRepository;
import com.buccodev.projectspringcurso.repositories.UserRapository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRapository userRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Everton Longo Bucco","nenecco@gmail.com","21966277","nennco123");
		User u2 = new User(null, "Sophia Longo Bucco","pita@gmail.com","21964578","pita123");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.DELIVERED,u2);
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"),OrderStatus.SHIPPED, u1);
	
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
	
}
