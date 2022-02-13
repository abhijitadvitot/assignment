package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.DepartmentRepository;
import com.example.demo.model.Department;
import com.example.demo.service.DepartmentService;


@Service
public class DepartmentServiceImp  implements DepartmentService {

	
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public List<Department> listDepartments() {
		return departmentRepository.findAll();
	}

	@Override
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public Department updateDepartment(Department department) {

		return departmentRepository.save(department) ;
	}

	@Override
	public String deleteDepartment(Department department) {
		departmentRepository.delete(department); 
		return "Delet";
	}

}
