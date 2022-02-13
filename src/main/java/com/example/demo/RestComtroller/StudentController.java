package com.example.demo.RestComtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.StudentServiceImp;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student") 
public class StudentController {

	@Autowired
	private StudentServiceImp studentServiceImp;
	
	@GetMapping("/all")
	public List<Student> listStudents()
	{
		 return studentServiceImp.listStudents();
		 
	}
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student student) {
		return studentServiceImp.saveStudent(student);
		
	}
	
	
	}
