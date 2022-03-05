package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> listEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
		return "Deleteed Successfully"+ employee;
	}

              
 	
}