package com.learning.kiija;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.learning.kiija")
public class KiijaApplication {

	protected static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		logger.info("Launching Kiija...");
		SpringApplication.run(KiijaApplication.class, args);
	}

}
