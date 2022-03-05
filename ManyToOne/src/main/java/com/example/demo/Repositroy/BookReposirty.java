package com.example.demo.Repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Repository 
public interface BookReposirty extends JpaRepository<Book,Long>
{

}
