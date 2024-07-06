package com.assignments.pandc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.pandc.models.Category;
import com.assignments.pandc.models.Product;
import com.assignments.pandc.repositories.CategoryRepository;

@Service
public class CategoryService {
@Autowired
CategoryRepository crepository;
	
public Iterable<Category> findAll() {
	return crepository.findAll();
	
}

public Category creatCategory(Category category) {
	return crepository.save(category);
}

public Optional<Category> findById(Long id) {
	return crepository.findById(id);
}

public List<Category> findallProNotinclude(Product product) {
	// TODO Auto-generated method stub
	return	crepository.findByProductsNotContains(product);
}

public Object findallproinclude(Product productId) {
	// TODO Auto-generated method stub
	return crepository.findAllByProducts(productId);
}
}
