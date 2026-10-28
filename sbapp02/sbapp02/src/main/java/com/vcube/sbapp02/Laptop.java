package com.vcube.sbapp02;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop implements Computer {

	@Override
	public void show() {
System.out.println("laptop method called");		
	}

}
