package com.example.demo.ServiceImp;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PostsRepository;
import com.example.demo.Services.PostsServices;
import com.example.demo.model.Post;
import com.example.demo.model.Tag;

@Service
public class PostsServiceImp implements PostsServices {

	
	@Autowired
	private PostsRepository postsRepository;
	
	
	
	@Override
	public List<Post> postsSet() {
		return postsRepository.findAll();
	}

	@Override
	public Post savePost(Post posts) {
		return postsRepository.save(posts);
	}

	@Override
	public Post updatePosts(Post posts) {

		return postsRepository.save(posts);
	}

	@Override
	public String deletePosts(Post posts) {
postsRepository.delete(posts);
		return "Delete Posts";
	}

}
