package com.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.Mapping;

@SpringBootApplication
public class ScheduleManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleManagementApplication.class, args);
		System.out.println("hola en springboot");
	}

}
