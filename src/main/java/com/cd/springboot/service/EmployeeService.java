package com.cd.springboot.service;

import java.util.List;

import com.cd.springboot.entity.Employee;



public interface EmployeeService {

	List<Employee> findAll();

	Employee findById(int theId);

	Employee save(Employee theEmployee);

	void deleteById(int employeeId);
}
