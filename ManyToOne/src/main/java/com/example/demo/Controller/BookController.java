package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.BookServiceImp;
import com.example.demo.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
 private BookServiceImp bookServiceImp;
	
	@GetMapping("/all")
	 public List<Book> getall()
	 {
		 return bookServiceImp.listBook();  
	 }
	
	@PostMapping("/save")
	public Book saveBook(@RequestBody Book book)
	{
		return bookServiceImp.saveBook(book);
		
	}
	
	@PutMapping("/update")
	public Book updateBook(@RequestBody Book book)
	{
		 return bookServiceImp.saveBook(book);
	}

    @DeleteMapping("/delete")
public String deleteBook(@RequestBody Book book)
{
    	bookServiceImp.deleteBook(book);
    	return  "Delete"+book;
     	
}
}
