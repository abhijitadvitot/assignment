package com.example.demo.Services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.model.Tag;



public interface TagsServices {

	public List<Tag> tagsSet();
	public Tag saveTagst(Tag tags);
	public  Tag updateTags(Tag tags);
	public String  deleteTags(Tag tags);
	
	
}
