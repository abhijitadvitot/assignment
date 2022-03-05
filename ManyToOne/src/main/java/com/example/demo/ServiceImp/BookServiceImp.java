package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositroy.BookReposirty;
import com.example.demo.Services.BookServices;
import com.example.demo.model.Book;

@Service
public class BookServiceImp implements BookServices {


	@Autowired
	 private BookReposirty bookReposirty;
	
	@Override
	public List<Book> listBook() {
		return bookReposirty.findAll();
	}

	@Override
	public Book saveBook(Book book) {
		return bookReposirty.save(book) ;
	}

	@Override
	public Book updateBook(Book book) {

		return bookReposirty.save(book);
	}

	@Override
	public String deleteBook(Book book) {
		bookReposirty.delete(book);
		return "Delete";
	}

}
