package com.example.BurgerTracker.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.BurgerTracker.Models.Burger;
@Repository
public interface BurgerReposetory extends CrudRepository<Burger, Long>{

	
	@Override
	List<Burger> findAll();
	Burger findByid(Long id);
}
