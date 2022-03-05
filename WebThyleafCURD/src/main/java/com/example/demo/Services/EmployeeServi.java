package com.example.demo.Services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Employee;

public interface EmployeeServi {

	public List<Employee> employeeList();

	public Employee saveEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public String deleteEmployee(Employee employee);

	
				public Employee findById(Long empid) ;
	// public Employee OneemployeeList( Long empid);
	// public String deleteById(Long empid) ;

}
