package com.example.demo.ServiceImp;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.TagsRepository;
import com.example.demo.Services.TagsServices;
import com.example.demo.model.Tag;

@Service
public class TagsServiceImp implements TagsServices {

@Autowired
	private TagsRepository tagsRepository;
	

	@Override
	public List<Tag> tagsSet() {
			
		return  tagsRepository.findAll();
	}

	@Override
	public Tag saveTagst(Tag tags) {
	
		return tagsRepository.save(tags);
	}

	@Override
	public Tag updateTags(Tag tags) {

		return tagsRepository.save(tags);
	}

	@Override
	public String deleteTags(Tag tags) {
		tagsRepository.delete(tags);
		return "Tags Delete";
	}

}
