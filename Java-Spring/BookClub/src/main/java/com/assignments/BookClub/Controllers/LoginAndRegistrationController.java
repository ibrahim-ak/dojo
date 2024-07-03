package com.assignments.BookClub.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.BookClub.Services.BookService;
import com.assignments.BookClub.Services.UserService;
import com.assignments.BookClub.models.Login;
import com.assignments.BookClub.models.User;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class LoginAndRegistrationController{

	@Autowired
	UserService userservice;

	@Autowired
	BookService bookService;
	@GetMapping("/")
	public String main(@ModelAttribute("newUser") User user, @ModelAttribute("logIn") Login login) {

		return "index.jsp";

	}

	@PostMapping("/adduser")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		userservice.register(newUser, result);

		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.
			model.addAttribute("logIn", new Login());
			return "index.jsp";
		}

		if (session.getAttribute("Theuser") == null) {
			session.setAttribute("Theuser", newUser);
		}

		return "redirect:/welcome";
	}

	@GetMapping("/welcome")
	public String welcomePage(HttpSession session ,Model model) {
		if (session.getAttribute("Theuser") == null) {
			return "redirect:/";
		}
		
		model.addAttribute("books", bookService.findall());
		return "Welcome.jsp";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("login") Login login, BindingResult result, Model model,
			HttpSession session) {

		User user =userservice.login(login, result);

		if (result.hasErrors()) {
			model.addAttribute("newUser", new User());
			return "index.jsp";
		}

		if (session.getAttribute("Theuser") == null) {
			session.setAttribute("Theuser", user);
		}

		

		return "redirect:/welcome";
	}
	@GetMapping("/logout")
	public String  logout(HttpSession session) {
		session.setAttribute("Theuser", null);
		return "redirect:/";
		
	}
}
