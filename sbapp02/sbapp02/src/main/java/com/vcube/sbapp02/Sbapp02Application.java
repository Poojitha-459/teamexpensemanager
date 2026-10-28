package com.vcube.sbapp02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Sbapp02Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(Sbapp02Application.class, args);
	Employee emp=(Employee)context.getBean(Employee.class);
	emp.display();
	}

}
