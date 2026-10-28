package com.vcube.empserviceportal.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.empserviceportal.model.Employee;
import com.vcube.empserviceportal.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	public Employee getEmployeeByEid(Integer eid) {
		return employeeRepository.findById(eid).orElseThrow();
	}

	public Employee getEmployeeByFirstName(String fname) {
		return employeeRepository.findByFname(fname);
	}

	//bussiness logic means service.
	public Employee updateEmployee(Employee employee, Integer eid) {
		Employee empDB=getEmployeeByEid(eid);
		empDB.setAge(employee.getAge());
		empDB.setCity(employee.getCity());
		empDB.setFname(employee.getFname());
		empDB.setLname(employee.getLname());
		empDB.setSalary(employee.getSalary());
		empDB.setState(employee.getState());
		return employeeRepository.save(empDB);
	}

	public void deleteEmployee(Integer eid) {
		employeeRepository.deleteById(eid);
	}
	
}
