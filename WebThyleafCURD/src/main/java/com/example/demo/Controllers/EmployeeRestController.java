package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.EmployeeServiceImp;
import com.example.demo.model.Employee;

@RestController
@RequestMapping("/employee") 
public class EmployeeRestController {

	
	@Autowired
	private EmployeeServiceImp employeeServiceImp;
	
	@GetMapping("/all")
	public  List<Employee>employeeList() {
		return employeeServiceImp.employeeList();
	}
//	@GetMapping("/{empid}")
//	public  Employee OneemployeeList(@PathVariable Long empid) 
//	{
//		return employeeServiceImp.findById(empid).
//	
//	}


	
	
	 @PostMapping("/save")
	 public Employee createEmployee(@RequestBody Employee employee)
	 {
		return employeeServiceImp.saveEmployee(employee);
		 
	 }
	 @PutMapping("/{empid}")
	 public ResponseEntity<Employee> updateOneEmployee(@PathVariable(value = "empid") Long empid, @RequestBody Employee employee){
	        Employee emp1=employeeServiceImp.findById(empid);
	        emp1.setEmpid(employee.getEmpid());
	        emp1.setEmpname(employee.getEmpname());
	        emp1.setEmpphn(employee.getEmpphn());
	        Employee emp2=employeeServiceImp.saveEmployee(emp1);
	        return ResponseEntity.ok(emp2);
	 }
	 
	@PutMapping("/upadate")
	public Employee updateEmployee(@RequestBody Employee employee)
	{
		return employeeServiceImp.updateEmployee(employee);
		
	}
	@DeleteMapping("/delete")
	public String deletString(@RequestBody  Employee employee)
	{
		  employeeServiceImp.deleteEmployee(employee);
		  
		  return "Deelte"+employee;
		 
	}
	
//	@DeleteMapping("/{empid}")
//    public String deleteOneByIdEmployee(@PathVariable Long empid){
//        employeeServiceImp.deleteById(empid);
//        return "Deleted : "+empid;
//
	}
