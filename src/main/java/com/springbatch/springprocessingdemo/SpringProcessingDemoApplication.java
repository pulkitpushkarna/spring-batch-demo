package com.springbatch.springprocessingdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringProcessingDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProcessingDemoApplication.class, args);
	}

}
