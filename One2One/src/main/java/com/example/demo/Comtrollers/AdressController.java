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

import com.example.demo.Resposrity.AddressReposrity;
import com.example.demo.curd.Address;	


@RestController
@RequestMapping("/address")
public class AdressController {

	@Autowired
	private AddressReposrity addressReposrity;
	
	@GetMapping("/all")
	public List<Address> getdetails() {
		return addressReposrity.findAll();
	}
		
	
	@PostMapping("/save")
	public Address saveDetails(@RequestBody Address address) {
		return addressReposrity.save( address);
		 
	}
	
	@PutMapping("/update")
	public Address updateDetails(@RequestBody Address address)
	{
		 return addressReposrity.save(address);
		 
	}
	
	@DeleteMapping("/delete")
	public String deleteDetials(@RequestBody Address address)
	{
		addressReposrity.delete(address);
		 return "Delete Address"+address;
	}
	
}
