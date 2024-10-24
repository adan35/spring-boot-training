package com.springboot.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasicPackages = {
				"com.springboot.springcoredemo",
				"com.springboot.util"
		}
)
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
