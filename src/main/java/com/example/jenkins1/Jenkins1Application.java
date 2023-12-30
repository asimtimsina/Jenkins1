package com.example.jenkins1;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Jenkins1Application {

	public static Logger log = LoggerFactory.getLogger(Jenkins1Application.class);

	@PostConstruct
	public void init(){
		log.info("Application Started");
	}

	public static void main(String[] args) {
		log.info("Application executed");

		SpringApplication.run(Jenkins1Application.class, args);
	}

}
