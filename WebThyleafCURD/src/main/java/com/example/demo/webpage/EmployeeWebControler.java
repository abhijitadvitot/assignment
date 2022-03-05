package com.example.demo.webpage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.ServiceImp.EmployeeServiceImp;
import com.example.demo.model.Employee;

@Controller

public class EmployeeWebControler {

	
	
	@Autowired
	private EmployeeServiceImp employeeServiceImp;
     
	 @Value("${myapp.title}")
	  private String pageTitle;


	@GetMapping("/index")
	public  String myPage(Model model) {
		   model.addAttribute("titleOfPage", pageTitle);
		
		   return "index";
	}
	
	@GetMapping("/list")
		public  String employeeList(Model  model) {
		  List<Employee> employeeList=employeeServiceImp.employeeList();
		  model.addAttribute("employees_list", employeeList);
		 return "listofemp";
	}
//	@GetMapping("/{empid}")
//	public  Employee OneemployeeList(@PathVariable Long empid) 
//	{
//		return employeeServiceImp.findById(empid).
//	
//	}
   @GetMapping("/add")
	public String addnew(Model model ) {
		 Employee employee=new Employee();
		 model.addAttribute("employees_add", employee);
	 return "addemployee";		
	}
	 @PostMapping("/save")
	 public String createEmployee(Model model , @ModelAttribute  ("employees_add" ) Employee  employee)
	 {   employeeServiceImp.saveEmployee(employee);
		   
		return "index";
		 
	 }
//	 @GetMapping("/update")
//	 public String updateEmployee(Model model, @PathVariable Long id)
//	 {
//	 Employee emp= repository.findById(id).get();
//	 model.addAttribute("employee_add", emp);
//	 model.addAttribute("msg", "UIpdated Records");
//	 return "registration_page";
//	 }
	 
//	 @PutMapping("/{empid}")
//	 public ResponseEntity<Employee> updateOneEmployee(@PathVariable(value = "empid") Long empid, @RequestBody Employee employee){
//	        Employee emp1=employeeServiceImp.findById(empid);
//	        emp1.setEmpid(employee.getEmpid());
//	        emp1.setEmpname(employee.getEmpname());
//	        emp1.setEmpphn(employee.getEmpphn());
//	        Employee emp2=employeeServiceImp.saveEmployee(emp1);
//	        return ResponseEntity.ok(emp2);
//	 }
//	 
	@GetMapping("/upadate")
	public String updateEmployee(Model model,@PathVariable Long id)
	{
		 Employee emp=employeeServiceImp.findById(id);
		
		model.addAttribute("employee_add", emp);
//		 model.addAttribute("msg", "UIpdated Records");
		return "index";
	}
//	@DeleteMapping("/delete")
//	public String deletString(@RequestBody  Employee employee)
//	{
//		  employeeServiceImp.deleteEmployee(employee);
//		  
//		  return "Deelte"+employee;
//		 
//	}
	
//	@DeleteMapping("/{empid}")
//    public String deleteOneByIdEmployee(@PathVariable Long empid){
//        employeeServiceImp.deleteById(empid);
//        return "Deleted : "+empid;
//
	}


