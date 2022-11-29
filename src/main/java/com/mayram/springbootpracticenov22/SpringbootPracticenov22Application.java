package com.mayram.springbootpracticenov22;

import com.mayram.springbootpracticenov22.model.User;
import com.mayram.springbootpracticenov22.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPracticenov22Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPracticenov22Application.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Mayra", "Mel", "Mayra@yahoo.com"));
		this.userRepository.save(new User("Melissa", "may", "Melissa@yahoo.com"));
		this.userRepository.save(new User("Shawn", "white", "Shawn@yahoo.com"));
		
	}
}
