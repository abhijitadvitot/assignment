package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Page_Table")
public class Page implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6003733222238559531L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Long id;
	private Integer number;
	private String content ,chapter;
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "book_id", nullable = false)
	private Book book;

	@Override
	public String toString() {
		return "Page [id=" + id + ", number=" + number + ", content=" + content + ", chapter=" + chapter + ", book="
				+ book + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(book, chapter, content, id, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Page other = (Page) obj;
		return Objects.equals(book, other.book) && Objects.equals(chapter, other.chapter)
				&& Objects.equals(content, other.content) && Objects.equals(id, other.id)
				&& Objects.equals(number, other.number);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getChapter() {
		return chapter;
	}

	public void setChapter(String chapter) {
		this.chapter = chapter;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	
	
	
	
}
