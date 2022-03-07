package net.rajorshi.firebase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class FirebaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirebaseApplication.class, args);
	}

}
