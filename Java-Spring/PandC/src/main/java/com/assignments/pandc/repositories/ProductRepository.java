package com.assignments.pandc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.pandc.models.Category;
import com.assignments.pandc.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	@Override
	 Iterable<Product> findAll();
    @Override
    
	Optional<Product> findById(Long id);

    List<Product> findAllByCategories(Category category);
	List<Product> findByCategoriesNotContains(Category category);
}
