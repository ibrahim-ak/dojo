package com.assignments.pandc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.pandc.models.Category;
import com.assignments.pandc.models.Product;
import com.assignments.pandc.repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository prepository;

	public Iterable<Product> findAll() {
		return prepository.findAll();

	}

	public Product createProduct(Product product) {
		return prepository.save(product);
	}

	public Optional<Product> findById(Long id) {

		return prepository.findById(id);

	}

	public List <Product> findallCatNotinclude(Category category) {
	
	return prepository.findByCategoriesNotContains(category);
	}

	public List <Product> findallCatinclude(Category categoryId) {
		
		return prepository.findAllByCategories(categoryId);
	}
}
