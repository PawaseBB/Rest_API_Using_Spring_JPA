package com.cd.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cd.springboot.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
