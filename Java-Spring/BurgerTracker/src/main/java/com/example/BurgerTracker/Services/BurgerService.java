package com.example.BurgerTracker.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BurgerTracker.Models.Burger;
import com.example.BurgerTracker.Repositories.BurgerReposetory;

@Service
public class BurgerService {
private final BurgerReposetory burgerRepository;
    
    public BurgerService(BurgerReposetory burgerRepository) {
        this.burgerRepository = burgerRepository;
    }
    
    public List<Burger> findAllBurgers() {
        return burgerRepository.findAll();
    }
    public Burger createBurger(Burger burger) {
    	 return burgerRepository.save(burger);
    	
    	
    }
}
