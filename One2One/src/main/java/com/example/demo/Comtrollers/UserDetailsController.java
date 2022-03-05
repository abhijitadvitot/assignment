package com.example.demo.Comtrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Resposrity.UserResposrity;
import com.example.demo.curd.User;

@RestController
@RequestMapping("/user")
public class UserDetailsController {

	@Autowired
        
	private UserResposrity userResposrity;
	
	
	@GetMapping("/all")
	public List<User> getDetails()	{
		 return userResposrity.findAll(); 
	}
	    
	@PostMapping("/save")
	public User saveDetails(@RequestBody User user)
	{
		return userResposrity.save(user);
		
	}
	   @PutMapping("/update")
	   public User updateDetails(@RequestBody User user)
	   {
		    return userResposrity.save(user);
		    
	   }
	    
	    @DeleteMapping("/delete")
	    
	    public String deleteDetails(@RequestBody User user)
	    {
	    	 userResposrity.delete(user);
	    	  return "Delete Successfully"+user;
	    }
	
	
}
