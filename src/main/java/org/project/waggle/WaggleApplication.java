package org.project.waggle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WaggleApplication {

	public static void main(String[] args) {

		SpringApplication.run(WaggleApplication.class, args);
		System.out.println("hello");
	}

}
