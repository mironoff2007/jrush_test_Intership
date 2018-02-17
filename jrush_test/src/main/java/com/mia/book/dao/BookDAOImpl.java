package com.mia.book.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mia.book.controller.BookController;
import com.mia.book.entity.Book;


@Repository
public class BookDAOImpl implements BookDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private BookController controller;
	
			
	public List<Book> getBooks(int page) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
				
		// create a query  ... sort by last name
		Query theQuery = 
				currentSession.createQuery("from Book order by id");
		
		// execute query and get result list
		int size=theQuery.list().size();
		int pageMax=(int) Math.ceil(size/10.0);
		
		System.out.println("page max ="+pageMax);
		if(page>pageMax)
		{
			page=pageMax;
			controller.setPage(page);
		}
		
		int fromIndex=(page-1)*10;
		int toIndex=fromIndex+10;
		if(toIndex>size-1){toIndex=size;}
		
		System.out.println("page ="+page+" / from ="+fromIndex+" / to ="+toIndex);
		List<Book> books = theQuery.list().subList(fromIndex, toIndex);
		
				
		// return the results		
		return books;
	}

	public void saveBook(Book theBook) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		System.out.println("save or update / theBook="+theBook);
		// save the customer ... finally LOL
		currentSession.saveOrUpdate(theBook);
		System.out.println("saved");
		
	}
	
	public void getMaxIdBook() {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// create a query  ... sort by last name
		List list  = currentSession.createQuery("select max(id) from Book").list();
		List listN  = currentSession.createSQLQuery("select max(id) from book").list();
		
		System.out.println("Max Book ID HQL= "+list.get(0));
		System.out.println("Max Book ID SQL= "+listN);
	}
	public Book getBook(int theId) {
		
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// now retrieve/read from database using the primary key
		Book theBook = (Book) currentSession.get(Book.class, theId);
		
		return theBook;
	}

	public void deleteBook(int theId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from Book where id=:bookId1");
		theQuery.setParameter("bookId1", theId);
		
		theQuery.executeUpdate();
	}

	
}

	






