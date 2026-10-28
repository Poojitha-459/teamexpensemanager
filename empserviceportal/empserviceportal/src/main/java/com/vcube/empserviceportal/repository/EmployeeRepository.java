package com.vcube.empserviceportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.empserviceportal.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	public abstract Employee findByFname(String fname);
}
