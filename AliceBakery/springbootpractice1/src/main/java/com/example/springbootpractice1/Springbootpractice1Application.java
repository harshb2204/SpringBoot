package com.example.springbootpractice1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springbootpractice1Application implements CommandLineRunner {


	@Autowired
	CakeBaker c1;

	public static void main(String[] args) {
		SpringApplication.run(Springbootpractice1Application.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(c1.bakecake());

	}
}
