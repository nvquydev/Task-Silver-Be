package com.example.Task.Silver.BE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class TaskSilverBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskSilverBeApplication.class, args);
	}

}
