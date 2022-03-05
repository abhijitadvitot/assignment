package com.example.demo.Resposrity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.curd.User;


@Repository
public interface UserResposrity extends JpaRepository<User, Long> {

}
