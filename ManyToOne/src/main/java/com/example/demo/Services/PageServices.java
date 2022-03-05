package com.example.demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Page;


@Service 
public interface PageServices {

	
	
	public List<Page> listPages();

	public Page savePage(Page page);
	public Page updatePagek(Page page);
	public String deletePage(Page page);
}
