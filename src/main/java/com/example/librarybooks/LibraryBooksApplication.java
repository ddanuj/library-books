package com.example.librarybooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LibraryBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryBooksApplication.class, args);
	}
}
