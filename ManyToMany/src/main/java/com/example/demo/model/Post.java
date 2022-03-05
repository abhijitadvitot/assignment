package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Post implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -456706709601872301L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title,description;
//	@JoinTable(
//            name = "tags_posts",    // intermediate physical table name 
//            joinColumns = {
//                    @JoinColumn(name = "posts_id")  // column to connect with posts
//                    },
//            inverseJoinColumns = {
//                    @JoinColumn(name="tags_id")   // column to connect with posts
//                    }
//            )

	 @JoinTable(name = "tags_posts",joinColumns = {@JoinColumn(name="post_id")},inverseJoinColumns = {@JoinColumn(name="tags_id")})
	
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL  )
	
     private List<Tag> tagsSet;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<Tag> getTagsSet() {
		return tagsSet;
	}


	public void setTagsSet(List<Tag> tagsSet) {
		this.tagsSet = tagsSet;
	}


	@Override
	public int hashCode() {
		return Objects.hash(description, id, tagsSet, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(description, other.description) && Objects.equals(id, other.id)
				&& Objects.equals(tagsSet, other.tagsSet) && Objects.equals(title, other.title);
	}


	@Override
	public String toString() {
		return "Posts [id=" + id + ", title=" + title + ", description=" + description + ", tagsSet=" + tagsSet + "]";
	} 

}

