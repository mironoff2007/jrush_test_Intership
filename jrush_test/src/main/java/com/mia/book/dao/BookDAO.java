package com.mia.book.dao;

import java.util.List;

import com.mia.book.entity.Book;


public interface BookDAO {

	public List<Book> getBooks(int page);

	public void saveBook(Book theBook);

	public void getMaxIdBook();

	void deleteBook(int theId);

	Book getBook(int theId);

	
	
}
