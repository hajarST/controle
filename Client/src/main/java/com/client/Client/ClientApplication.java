package com.client.Client;

import com.client.Client.entities.Client;
import com.client.Client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
	CommandLineRunner initializer(ClientRepository clientRepository){
		return args ->{
			clientRepository.save(new Client(1, "SABT HAJAR", 27));
			clientRepository.save(new Client(2, "BADIA AHMED", 23));
			clientRepository.save(new Client(3, "MORAD SARA", 25));
		};
	}
}
