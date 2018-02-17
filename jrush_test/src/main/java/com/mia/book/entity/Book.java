package com.mia.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="author")
	private String author;
	
	@Column(name="isbn")
	private String isbn;
	
	@Column(name="print_year")
	private int print_year;
	
	@Column(name="read_already")
	private boolean read_already;
	
	public Book() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	

	public int getPrint_year() {
		return print_year;
	}

	public void setPrint_year(int print_year) {
		this.print_year = print_year;
	}

	public boolean isRead_already() {
		return read_already;
	}

	public void setRead_already(boolean read_already) {
		this.read_already = read_already;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title +", author=" + author + ", descr=" + description + "]";
	}
		
}





