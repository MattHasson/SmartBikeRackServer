package com.bikenest.bikerackserver;

import com.bikenest.bikerackserver.model.Apartment;
import com.bikenest.bikerackserver.model.User;
import com.bikenest.bikerackserver.repository.ApartmentRepository;
import com.bikenest.bikerackserver.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner loadApartmentData(ApartmentRepository repository) {
		return (args) -> {
			repository.save(new Apartment(1, "Cottonwood", "123 6th St", "Bismarck", "58504" ));
			repository.save(new Apartment(2, "Citadel", "123 6th St", "Bismarck", "58504" ));
			repository.save(new Apartment(3, "Woodbridge", "123 6th St", "Bismarck", "58504" ));
			repository.save(new Apartment(4, "Woodburry", "123 6th St", "Bismarck", "58504" ));
		};
	}

	@Bean
	public CommandLineRunner loadsUserData(UserRepository repository) {
		return (args) -> {
			repository.save(new User(1, "mw1", "Maya1", "Wald1", "mw1", 1));
			repository.save(new User(2, "mw2", "Maya2", "Wald2", "mw2", 2));

		};
	}

}
