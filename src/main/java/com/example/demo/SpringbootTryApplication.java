package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootTryApplication {

	public static void main(String[] args) {
		System.out.println("before spring application run");
		SpringApplication.run(SpringbootTryApplication.class, args);
		System.out.println("after spring application run");
	}
}