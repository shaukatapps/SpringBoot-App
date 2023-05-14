package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootTestAppApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext run =	SpringApplication.run(SpringBootTestAppApplication.class, args);
	 //changes for HIS-124
	 run.close();
	}

}
