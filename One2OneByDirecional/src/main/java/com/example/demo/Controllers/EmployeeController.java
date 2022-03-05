package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.serviceimp.EmployeeServiceImpl;
import com.example.demo.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	    @Autowired
	    private EmployeeServiceImpl employeeServiceImpl;

	    @GetMapping("/all")
	    public List<Employee> findEmp() {
	        return employeeServiceImpl.listEmployee();
	    }

	    @PostMapping("/save")
	    public Employee saveEmployee(@RequestBody Employee employee) {
	        return employeeServiceImpl.saveEmployee(employee);
	    }

	    @PutMapping("/update")
	    public Employee updateEmployee(@RequestBody Employee employee) {
	        return employeeServiceImpl.updateEmployee(employee);
	    }
	    @DeleteMapping("/delete")
	    public String deleteEmployee(@RequestBody Employee employee) {
	        employeeServiceImpl.deleteEmployee(employee);
	     return "Deleteed Succesffullu"+employee;
	    }

}
	

	

