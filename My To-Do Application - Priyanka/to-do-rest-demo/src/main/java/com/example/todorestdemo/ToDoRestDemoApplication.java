package com.example.todorestdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.todorestdemo")
public class ToDoRestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoRestDemoApplication.class, args);
	}
}