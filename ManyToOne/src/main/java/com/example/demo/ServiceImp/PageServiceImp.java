package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositroy.PageRepository;
import com.example.demo.Services.PageServices;
import com.example.demo.model.Page;

@Service
public class PageServiceImp implements PageServices{

	@Autowired
	private PageRepository pageRepository;
	
	@Override
	public List<Page> listPages() {
		return pageRepository.findAll();
	}

	@Override
	public Page savePage(Page page) {
		// TODO Auto-generated method stub
		return pageRepository.save(page);
	}

	@Override
	public Page updatePagek(Page page) {

		return pageRepository.save(page);
	}

	@Override
	public String deletePage(Page page) {
		// TODO Auto-generated method stub
		pageRepository.delete(page);
		return "DeletePage";
	}

}
