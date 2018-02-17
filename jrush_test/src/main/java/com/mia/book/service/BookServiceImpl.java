package com.mia.book.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mia.book.dao.BookDAO;
import com.mia.book.entity.Book;



@Service
public class BookServiceImpl implements BookService {

	// need to inject book dao
	@Autowired
	private BookDAO bookDAO;
	
	@Transactional
	public List<Book> getBooks(int page) {
		return bookDAO.getBooks(page);
	}

	@Transactional
	public void saveBook(Book theBook) {

		bookDAO.saveBook(theBook);
	}
	
	@Transactional
	public void getMaxIdBook() {
		bookDAO.getMaxIdBook();
	}


	@Transactional
	public Book getBook(int theId) {
		
		return bookDAO.getBook(theId);
	}

	@Transactional
	public void deleteBook(int theId) {
		
		bookDAO.deleteBook(theId);
	}
	@Transactional
	public void readBook(int theId) 
	{
		
		Book theBook = (Book) bookDAO.getBook(theId);
		
		if(!theBook.isRead_already()){
			theBook.setRead_already(true);
			System.out.print("read theBook="+theBook);
		    bookDAO.saveBook(theBook);
	}
		
	}

	
			
}





