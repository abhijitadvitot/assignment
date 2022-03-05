package com.example.demo.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity 
@Table(name = "Book_Table")
public class Book implements Serializable {

	 /**
	 * 
	 */
	private static final long serialVersionUID = -1818308219656792447L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long id;
	 private String title,author;
	 
	 @OneToMany(mappedBy = "book",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 private List<Page> page;
	 
	 @Override
	public int hashCode() {
		return Objects.hash(author, id, page, title);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(id, other.id) && Objects.equals(page, other.page)
				&& Objects.equals(title, other.title);
	}


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


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public List<Page> getPage() {
		return page;
	}


	public void setPage(List<Page> page) {
		this.page = page;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", page=" + page + "]";
	}


	
}
