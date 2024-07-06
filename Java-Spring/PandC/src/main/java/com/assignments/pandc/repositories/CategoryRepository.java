package com.assignments.pandc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.pandc.models.Category;
import com.assignments.pandc.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	@Override
	Iterable<Category> findAll();
	Category  findByIdIs(Long id);
	List<Category> findAllByProducts(Product product);
	List<Category> findByProductsNotContains(Product product);
}
