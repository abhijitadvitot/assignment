package com.example.demo.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.StudentServiceImp;
import com.example.demo.model.Student;



@RestController
@RequestMapping("/student")
public class StudentRestController {

	
	@Autowired
	private StudentServiceImp studentServiceImp;
	
	
	@GetMapping("/")
	public  List<Student> studentsList(){
		  return studentServiceImp.studentsList();
		  
	}
	   
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		  
		return studentServiceImp.add(student);
	}
	
	@PutMapping("/update")
   public void updateStudent(@RequestBody Student student   )
   {
		 studentServiceImp.update(student);
   }

 @DeleteMapping ("/delete/{id}")
 public String deelete(@PathVariable Long id) {
	    studentServiceImp.deleteByID(id);
	    return "Delete";
 }
}
