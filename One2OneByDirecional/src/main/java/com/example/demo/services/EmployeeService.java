package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public interface EmployeeService {

	public List<Employee> listEmployee();
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(Employee employee);
	
	
}
