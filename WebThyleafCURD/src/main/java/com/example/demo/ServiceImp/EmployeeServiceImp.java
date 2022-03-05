package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositoy.EmployeeReopsiotry;
import com.example.demo.Services.EmployeeServi;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImp  implements EmployeeServi{

	
	
	@Autowired
	   private  EmployeeReopsiotry employeeReopsiotry;
	
	@Override
	public List<Employee> employeeList() {
		return employeeReopsiotry.findAll();
		
	}
//	@Override
//	public  Employee OneemployeeList( Long empid) {
//		return employeeReopsiotry.getById(empid)
//	}


	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeReopsiotry.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeReopsiotry.save(employee);
	}

	@Override
	public String deleteEmployee(Employee employee) {
	 employeeReopsiotry.delete(employee);
		return "DeleteSuccefull"+deleteEmployee(employee);
	}

@Override
	public Employee findById(Long empid) {
		return employeeReopsiotry.getById(empid);
	}
////
//	public String deleteById(Long empid) {
//	   employeeReopsiotry.deleteById(empid);
//		return "delete"+empid;
//		// TODO Auto-generated method stub
//		
//	}

}
