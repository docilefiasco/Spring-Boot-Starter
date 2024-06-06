package com.example.CourseApi;

import hello.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import topic.TopicController;

@ComponentScan(basePackageClasses = HelloController.class)//need to add this to provide class scan path
@ComponentScan(basePackageClasses = TopicController.class)
@SpringBootApplication
public class CourseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseApiApplication.class, args);
	}

}
