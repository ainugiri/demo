package com.example.demo;

import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class DemoApplication {
	public static Logger loginfo = (Logger) LoggerFactory.getLogger(DemoApplication.class);
	
	@PostConstruct
	public void initialize()
	{
		loginfo.info("Application start");
	}
	public static void main(String[] args) {
		loginfo.info("Main start");
		loginfo.info(" start");
		SpringApplication.run(DemoApplication.class, args);
	}

}
