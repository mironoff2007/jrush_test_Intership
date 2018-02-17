package com.mia.book.service;

import java.util.List;

import com.mia.book.entity.Book;





public interface BookService {

	public List<Book> getBooks(int page);

	public void saveBook(Book theBook);

	void getMaxIdBook();

	public void deleteBook(int theId);

	public Book getBook(int theId);

	public void readBook(int theId);
	
}
