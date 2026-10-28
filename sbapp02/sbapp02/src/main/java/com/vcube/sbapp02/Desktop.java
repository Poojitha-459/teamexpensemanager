package com.vcube.sbapp02;


import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

	@Override
	public void show() {
System.out.println("desktop methos called");		
	}

}
