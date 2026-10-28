package com.vcube.empserviceportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.empserviceportal.model.Employee;
import com.vcube.empserviceportal.service.EmployeeService;

@RestController
@RequestMapping("api/v1")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/CreateEmp")
	 Employee createEmp(@RequestBody Employee employee){
		return employeeService.createEmployee(employee);
	}
	
	
}
