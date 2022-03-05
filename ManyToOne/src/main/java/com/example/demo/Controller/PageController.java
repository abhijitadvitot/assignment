package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.PageServiceImp;
import com.example.demo.model.Page;

@RestController
@RequestMapping("/page")
public class PageController {

	@Autowired
	private PageServiceImp pageServiceImp;
	
	@GetMapping("/all")
	public List<Page> getall()
	
	{
	 return pageServiceImp.listPages();
	 
	}
	@PostMapping("/save")
	public Page savePage(@RequestBody Page page)
	{
		return pageServiceImp.savePage(page);
		
	}
	
	@PutMapping("/update")
	public Page update(@RequestBody Page page)
	{
		  return pageServiceImp.updatePagek(page);
	}
	
	@DeleteMapping("/delete")
	public String deletePage(@RequestBody Page page)
	
	{
pageServiceImp.deletePage(page);
return"Delete";

		  
	}
}

