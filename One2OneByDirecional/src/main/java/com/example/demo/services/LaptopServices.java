package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Laptop;

@Service
public interface LaptopServices {
	public List<Laptop> listLaptop();
	public Laptop savelaptop(Laptop laptop);
	public Laptop updatelaptop(Laptop laptop);
	public String deletelaptop(Laptop laptop);

}
