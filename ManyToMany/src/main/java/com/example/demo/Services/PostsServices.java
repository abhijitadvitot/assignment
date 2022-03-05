package com.example.demo.Services;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.demo.model.Post;


public interface PostsServices {

	public List<Post> postsSet();
	public Post savePost(Post posts);
	public  Post updatePosts(Post posts);
	public String  deletePosts(Post posts);
	
	
	
}
