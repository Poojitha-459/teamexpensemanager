package com.vcube.sbapp02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
int age;
String name;
Computer computer;

void display() {
	System.out.println("display method called from emp");
	computer.show();
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Computer getComputer() {
	return computer;
}
@Autowired
@Qualifier("desktop")
public void setComputer(Computer computer) {
	this.computer = computer;
}

}
