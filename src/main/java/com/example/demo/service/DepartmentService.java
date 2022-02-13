package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Department;


public interface DepartmentService {

	
	public List<Department> listDepartments();
	
	public Department saveDepartment(Department department);

	public Department updateDepartment(Department department);
	public String deleteDepartment(Department department);
}
