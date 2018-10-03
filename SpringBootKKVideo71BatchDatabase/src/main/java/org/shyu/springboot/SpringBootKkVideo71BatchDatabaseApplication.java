package org.shyu.springboot;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringBootKkVideo71BatchDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKkVideo71BatchDatabaseApplication.class, args);
	}
}
