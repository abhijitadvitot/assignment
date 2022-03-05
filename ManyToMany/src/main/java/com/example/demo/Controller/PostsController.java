package com.example.demo.Controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.PostsServiceImp;
import com.example.demo.model.Post;

@RestController
@RequestMapping("/posts")
public class PostsController {
	@Autowired
	private PostsServiceImp postsServiceImp;
	
	
	
	@GetMapping("/all")
	 public List<Post> getall()
	
	{
		return postsServiceImp.postsSet();
		
	}
 
	@PostMapping("/save")
	public  Post savePosts(@RequestBody Post posts)
	{
		 return postsServiceImp.savePost(posts);
		 
	}

   @PutMapping("/update")
   public Post updatePosts (@RequestBody  Post posts)
   {
	    return postsServiceImp.updatePosts(posts);
	    
   }
@DeleteMapping("/delete")
public String deletePosts(@RequestBody Post posts)
    {postsServiceImp.deletePosts(posts);
       return "delte";    
    }


}
