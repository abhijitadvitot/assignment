package com.example.demo.Resposrity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.curd.Address;

@Repository
public interface AddressReposrity extends JpaRepository<Address, Long> {

}
