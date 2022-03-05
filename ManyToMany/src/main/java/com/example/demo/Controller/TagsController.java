package com.example.demo.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.TagsServiceImp;
import com.example.demo.model.Tag;

@RestController
@RequestMapping("/tags")
public class TagsController {

	@Autowired
	private  TagsServiceImp tagsServiceImp;
	
	
	@GetMapping("/all")
	public List<Tag> getall(@RequestBody Tag tags)
	
	{
		return tagsServiceImp.tagsSet();
		
		
	}

	@PostMapping("/save")
	public Tag saveTags(@RequestBody Tag tags)
	{
		 return tagsServiceImp.saveTagst(tags);
		 
	}
	@PutMapping("/update")
	public Tag updaeTags(@RequestBody Tag tags)
	{
		return tagsServiceImp.updateTags(tags);
		
	}
	@DeleteMapping("/Delete")
	public String deleteTags(@RequestBody Tag tags)
	{
		 tagsServiceImp.deleteTags(tags);
		 return"Tags Delete";
	}
}
