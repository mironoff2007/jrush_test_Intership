package com.mia.book.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mia.book.entity.Book;
import com.mia.book.service.BookService;



@Controller
@RequestMapping("/book")
public class BookController {

	private int page = 1;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page=page;
	}
	// need to inject our book service
	@Autowired
	private BookService bookService;
	
	@GetMapping("/list")
	public String listBooks(Model theModel) {
		
		// get books from the service
		List<Book> theBooks = bookService.getBooks(page);
				
		// add the books to the model
		theModel.addAttribute("books", theBooks);
		
		return "books-list";
	}
	
	
	
	@RequestMapping("/getMaxIdBook")
	public String getMaxIdBook () 
	{
		System.out.println("GetMaxIdBook-controller");
		bookService.getMaxIdBook();
		return "redirect:/book/list";
		
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Book theBook = new Book();
		
		theModel.addAttribute("book", theBook);
		
		return "book-form";
	}
	
	
	
	@PostMapping("/saveBook")
	public String saveBook(@ModelAttribute("book") Book theBook) {
		
		// save the book using our service
		bookService.saveBook(theBook);
		
		
		return "redirect:/book/list";
	}
	
	@GetMapping("/readBook")
	public String readBook(@RequestParam("bookId") int theId) 
	{
		
		// read the book using our service
		bookService.readBook(theId);
		
		
		return "redirect:/book/list";
	}
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("bookId") int theId,
									Model theModel) {
		
		// get the book from our service
		Book theBook = bookService.getBook(theId);	
		theBook.setRead_already(false);
		// set book as a model attribute to pre-populate the form
		theModel.addAttribute("book", theBook);
		
		// send over to our form		
		return "book-update";
	}
	
	@GetMapping("/delete")
	public String deleteBook(@RequestParam("bookId") int theId) {
		
		// delete the book
		bookService.deleteBook(theId);
		
		return "redirect:/book/list";
	}
	
	@RequestMapping("/nextp")
	public String nextPage() {
		
		// delete the book
	
		page=page+1;
		return "redirect:/book/list";
	}
	
	@RequestMapping("/prevp")
	public String prevPage() {
		
		// delete the book
	
		if(page>=2) {page=page-1;}
		return "redirect:/book/list";
	}
	
}










