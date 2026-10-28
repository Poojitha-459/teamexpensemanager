package com.vcube.sbapp02;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
@GetMapping("/hello")
 String welcome() {
return"springboot is not easy";
}
 
@GetMapping("/st1")
Student GetStudent() {
	Student st=new Student(1, "puji" ,21);
	return st;
}
@GetMapping("/stlist")
List<Student> getStudentList(){
	List<Student> studentList=new ArrayList<>();
	Student st1=new Student(1,"puji",21);
	Student st2=new Student(2,"p00ji",19);	
	Student st3=new Student(3,"pujitha",20);
	Student st4=new Student(4,"poojitha",22);
	
	studentList.add(st1);
	studentList.add(st2);
	studentList.add(st3);
	studentList.add(st4);
	return studentList;
}
}
