package com.assignments.LoginandRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.assignments.LoginandRegistration.Models.LogIn;
import com.assignments.LoginandRegistration.Models.User;
import com.assignments.LoginandRegistration.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {

	@Autowired
	UserService userservice;

	@GetMapping("/")
	public String main(@ModelAttribute("newUser") User user, @ModelAttribute("logIn") LogIn login) {

		return "index.jsp";

	}

	@PostMapping("/adduser")
	public String register(@Valid @ModelAttribute("newUser") User newUser, BindingResult result, Model model,
			HttpSession session) {

		userservice.register(newUser, result);

		if (result.hasErrors()) {
			// Be sure to send in the empty LoginUser before
			// re-rendering the page.
			model.addAttribute("logIn", new LogIn());
			return "index.jsp";
		}

		if (session.getAttribute("Theuser") == null) {
			session.setAttribute("Theuser", newUser);
		}

		return "redirect:/welcome";
	}

	@GetMapping("/welcome")
	public String welcomePage() {
		return "Welcome.jsp";
	}

	@PostMapping("/login")
	public String login(@Valid @ModelAttribute("login") LogIn login, BindingResult result, Model model,
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
