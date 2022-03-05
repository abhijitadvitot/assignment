package com.example.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LaptopRepository;
import com.example.demo.model.Laptop;
import com.example.demo.services.LaptopServices;

@Service
public class LaptopServiceImp  implements LaptopServices {
@Autowired 
	private LaptopRepository laptopRepository;
	@Override
	public List<Laptop> listLaptop() {

		return laptopRepository.findAll();
	}

	@Override
	public Laptop savelaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public Laptop updatelaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public String deletelaptop(Laptop laptop) {
laptopRepository.delete(laptop);
		return "Delete Successfuly";
	}

}
