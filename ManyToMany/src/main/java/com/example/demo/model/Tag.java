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
import javax.persistence.ManyToMany;

@Entity
public class Tag implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5112727358363768628L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;
	
	private String name;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY,mappedBy = "tagsSet")
	private List<Post>postsSet;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Post> getPostsSet() {
		return postsSet;
	}

	public void setPostsSet(List<Post> postsSet) {
		this.postsSet = postsSet;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, postsSet);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(postsSet, other.postsSet);
	}

	@Override
	public String toString() {
		return "Tags [id=" + id + ", name=" + name + ", postsSet=" + postsSet + "]";
	}
	
	
}
