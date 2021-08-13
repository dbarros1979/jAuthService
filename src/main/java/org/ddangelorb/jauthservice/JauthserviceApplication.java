package org.ddangelorb.jauthservice;

import java.util.ArrayList;
import java.util.Arrays;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.ddangelorb.jauthservice.model.Roles;
import org.ddangelorb.jauthservice.model.Users;
import org.ddangelorb.jauthservice.service.UsersService;


@SpringBootApplication
public class JauthserviceApplication implements CommandLineRunner {
	@Autowired
	UsersService userService;
	
	public static void main(String[] args) {
		SpringApplication.run(JauthserviceApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... params) throws Exception {
		if (!userService.existsByUsername("admin")) {
			Users admin = new Users();
		    admin.setUsername("admin");
		    admin.setPassword("admin");
		    admin.setEmail("admin@email.com");
		    admin.setActive(1);
		    admin.setRoles(new ArrayList<Roles>(Arrays.asList(Roles.ROLE_ADMIN)));
		
		    userService.signup(admin);
		}
	
		if (!userService.existsByUsername("client")) {
		    Users client = new Users();
		    client.setUsername("client");
		    client.setPassword("client");
		    client.setEmail("client@email.com");
		    client.setActive(1);
		    client.setRoles(new ArrayList<Roles>(Arrays.asList(Roles.ROLE_CLIENT)));
		
		    userService.signup(client);
		}
	}
}
