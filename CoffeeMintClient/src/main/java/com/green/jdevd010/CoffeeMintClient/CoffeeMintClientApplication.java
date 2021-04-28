package com.green.jdevd010.CoffeeMintClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CoffeeMintClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeMintClientApplication.class, args);
		BCryptPasswordEncoder endcode = new BCryptPasswordEncoder();
		System.out.println("Pass was Gen: " + endcode.encode("123456"));
	}

}
