package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public interface BookServices {
	
	
	

public List<Book> listBook();

public Book saveBook(Book book);
public Book updateBook(Book book);
public String deleteBook(Book book);
}