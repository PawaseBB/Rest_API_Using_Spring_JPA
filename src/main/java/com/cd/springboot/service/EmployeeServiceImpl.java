package com.cd.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cd.springboot.dao.EmployeeRepository;
import com.cd.springboot.entity.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
		
		employeeRepository = theEmployeeRepository;
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {
	Optional<Employee>	result= employeeRepository.findById(theId);
	
	Employee theEmployee=null;
	if(result.isPresent()) {
		theEmployee = result.get();
	}else {
		throw new RuntimeException("did not fint Employee Id - "+theId);
	}
		return theEmployee;
	}

	@Override
	public Employee save(Employee theEmployee) {
		return employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(int employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
