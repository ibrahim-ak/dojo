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
public class ProductController {
	@Autowired 
	ProductService pservice;
	@Autowired 
	CategoryService cservice;
	@GetMapping("/products/new")
	public String createIndex(@ModelAttribute("Products") Product product ){
		
		return "ProductCreation.jsp";
		
		
	}
	
	@PostMapping("/products/new")
	public String creatingProduct(@Valid @ModelAttribute("Products") Product product ,BindingResult result) {
		 if (result.hasErrors()) {
			 
	            return "ProductCreation.jsp";
	        } else {
	            pservice.createProduct(product);
	            return "redirect:/";
	        }
	}
	@GetMapping("products/{id}")
	public String productView(@PathVariable("id")Long id, Model model) {
	Optional<Product> pid=	pservice.findById(id);
	Product ProductId =pid.get();
		model.addAttribute("pid" ,ProductId );
		model.addAttribute("productsNOTinclude",cservice.findallProNotinclude(ProductId));
		model.addAttribute("productsinclude",cservice.findallproinclude(ProductId));
		return "Product.jsp";
	}
	@PostMapping("products/{id}")
	public String productupdate(@PathVariable("id")Long id, Model model,@RequestParam(value = "categoryId") Long categoryId) {
	Optional<Product> pid=	pservice.findById(id);
	Product ProductId =pid.get();
	Optional<Category> cid=	cservice.findById(id);
	Category categoryID = cid.get();
	ProductId.getCategories().add(categoryID);
	pservice.createProduct(ProductId);
	
		return "redirect:/products/{id}";
	}
	
	
}
