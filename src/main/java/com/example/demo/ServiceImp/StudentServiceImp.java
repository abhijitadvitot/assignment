package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepositry;
import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@Service
public class StudentServiceImp  implements StudentService{

	
	@Autowired
	private StudentRepositry studentRepositry;

	@Override
	public List<Student> listStudents() {
	
		return studentRepositry.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepositry.save( student);
	}

	@Override
	public Student updateStudent(Student student) {
	
		return studentRepositry.save(student);
	}

	@Override
	public String deleteStudent(Student student) {
	studentRepositry.delete(student);
		return "Delete"+student;
	}
	
}
