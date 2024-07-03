package com.assignments.BookClub.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.assignments.BookClub.Services.BookService;
import com.assignments.BookClub.models.Book;
import com.assignments.BookClub.models.User;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;





@Controller
public class BookController {
	@Autowired
	BookService bookservice;
	
	
	@GetMapping("/createbook")
	public String creatBookPage(HttpSession session, @ModelAttribute("books") Book book ) {
		if (session.getAttribute("Theuser") == null) {
			return "redirect:/";
			
		}
		return "createbook.jsp";
	}
	
	@PostMapping("/newbook")
	public String creatBook(@Valid @ModelAttribute("books") Book book , BindingResult result,Model model, HttpSession session) {
		if (session.getAttribute("Theuser") == null) {
			return "redirect:/";
			
		}
		if (result.hasErrors()) {
			model.addAttribute("books",book);
			
			return "redirect:/createbook";
			
		} else {
			User user = (User) session.getAttribute("Theuser");
			book.setUser(user);
			bookservice.createBook(book);
			return "redirect:/welcome";
		}

	}
	@GetMapping("/books/{id}")	
	public String getBook(HttpSession session, Model model,@PathVariable("id")Long id) {
		if (session.getAttribute("Theuser") == null) {
			return "redirect:/";
		}
		model.addAttribute("book", bookservice.findById(id));
		User user = (User) session.getAttribute("Theuser");
		Long useid =user.getId();
		model.addAttribute("userid",useid);
		return "showbook.jsp";
	}

	@GetMapping("/books/{id}/editbook")
	public String editRender(@PathVariable("id")Long id, HttpSession session, @ModelAttribute("books") Book book ,Model model) {
		
		
		if (session.getAttribute("Theuser") == null) {
			return "redirect:/";
		}
		Book book2= bookservice.findById(id);
	   
	    model.addAttribute("books", book2);
			
	    
		
		
		return "editbook.jsp";
	}
	@PutMapping("/books/{id}/editbook")
	public String editBook(@PathVariable("id")Long id, HttpSession session,@Valid @ModelAttribute("books") Book book) {

		if (session.getAttribute("Theuser") == null) {
			return "redirect:/";
		}
		User user = (User) session.getAttribute("Theuser");
		book.setUser(user);
		bookservice.updateBook(book);
		return "redirect:/welcome";
		
		
	}
	
	@GetMapping("/books/{id}/delete")
	public String  deleteTravel(@PathVariable ("id") Long id) {
		 bookservice.deletebook(id);
		 return "redirect:/welcome";
	}
	
	

}