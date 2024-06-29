package com.example.BooksAPI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.BooksAPI.models.Book;
import com.example.BooksAPI.services.BookServices;




@Controller
public class BookController {

	private final BookServices bookService;

	public BookController(BookServices bookService) {
		this.bookService = bookService;
	}
	
	@RequestMapping(value = "books/{id}", method=RequestMethod.GET)
	public String showBook(@PathVariable("id") Long id, Model model) {
	Book book = 	bookService.findBook(id);
	model.addAttribute("book",book);
	System.out.println(book);
	return "show.jsp";
		
	}
	
}
