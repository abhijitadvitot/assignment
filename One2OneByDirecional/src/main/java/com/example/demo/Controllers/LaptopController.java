package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Laptop;
import com.example.demo.serviceimp.LaptopServiceImp;
import com.example.demo.services.LaptopServices;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

	
	

    @Autowired
    private LaptopServiceImp laptopServicesImp;

    @GetMapping("/all")
    public List<Laptop> findlaptop() {
        return laptopServicesImp.listLaptop();
    }

    @PostMapping("/save")
    public Laptop saveLaptop(@RequestBody Laptop laptop) {
        return laptopServicesImp.savelaptop(laptop);
    }

    @PutMapping("/update")
    public Laptop updatelaptop(@RequestBody Laptop laptop) {
        return laptopServicesImp.updatelaptop(laptop) ;
    }
    @DeleteMapping("/delete")
    public String deleteLaptop(@RequestBody Laptop laptop) {
        laptopServicesImp.deletelaptop(laptop);
     return "Deleteed Succesffullu"+laptop;
    }

}
