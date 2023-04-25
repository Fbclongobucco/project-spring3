package com.buccodev.projectspringcurso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.buccodev.projectspringcurso.entities.User;
import com.buccodev.projectspringcurso.repositories.UserRapository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRapository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Everton Longo Bucco","nenecco@gmail.com","21966277","nennco123");
		User u2 = new User(null, "Sophia Longo Bucco","pita@gmail.com","21964578","pita123");
		
		userRepository.saveAll(Arrays.asList(u1,u2));
	}
	
}
