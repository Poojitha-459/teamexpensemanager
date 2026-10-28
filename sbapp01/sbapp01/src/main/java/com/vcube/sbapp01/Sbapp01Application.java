  package com.vcube.sbapp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sbapp01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Sbapp01Application.class, args);
		Customer c1=(Customer)context.getBean(Customer.class);
		System.out.println(c1.getCid());
		System.out.println(c1.cname);
	}

}
