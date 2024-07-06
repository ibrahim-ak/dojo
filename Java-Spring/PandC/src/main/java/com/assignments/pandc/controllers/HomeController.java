package com.assignments.pandc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.assignments.pandc.models.Category;
import com.assignments.pandc.models.Product;
import com.assignments.pandc.services.CategoryService;
import com.assignments.pandc.services.ProductService;

@Controller
public class HomeController {
	@Autowired
	ProductService pservice;
	@Autowired
	CategoryService cservice;

	@GetMapping("/")
	public String index(Model model) {
	Iterable<Product>	Products =pservice.findAll();
	Iterable<Category>	Categories =cservice.findAll();
	model.addAttribute("products",Products);
	model.addAttribute("categories",Categories);
		return "index.jsp";
	}

}
