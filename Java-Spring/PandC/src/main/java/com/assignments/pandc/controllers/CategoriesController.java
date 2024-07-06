package com.assignments.pandc.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assignments.pandc.models.Category;
import com.assignments.pandc.models.Product;
import com.assignments.pandc.services.CategoryService;
import com.assignments.pandc.services.ProductService;

import jakarta.validation.Valid;

@Controller
public class CategoriesController {
	@Autowired
	CategoryService cservice;
	@Autowired
	ProductService pservice;

	@GetMapping("/categories/new")
	public String createIndex(@ModelAttribute("Categories") Category category) {

		return "CategoryCreation.jsp";
	}

	@PostMapping("/categories/new")
	public String categoryCreation(@Valid @ModelAttribute("Categories") Category category, BindingResult result) {
		if (result.hasErrors()) {

			return "CategoryCreation.jsp";
		} else {
			cservice.creatCategory(category);
			return "redirect:/";
		}
	}

	@GetMapping("categories/{id}")
	public String productView(@PathVariable("id") Long id, Model model) {
		Optional<Category> cid = cservice.findById(id);
		Category categoryId = cid.get();
		model.addAttribute("cid", categoryId);
		model.addAttribute("categoriesNotinclude", pservice.findallCatNotinclude(categoryId));
		model.addAttribute("categoriesinclude", pservice.findallCatinclude(categoryId));
		return "Category.jsp";
	}

	@PostMapping("categories/{id}")
	public String productUpdate(@PathVariable("id") Long id, Model model,
			@RequestParam(value = "productId") Long productId) {
		Optional<Category> cid = cservice.findById(id);
		Category categoryId = cid.get();
		Optional<Product> pid = pservice.findById(productId);
		Product productID = pid.get();
		categoryId.getProducts().add(productID);
		cservice.creatCategory(categoryId);
		return "redirect:/categories/{id}";
	}

}
