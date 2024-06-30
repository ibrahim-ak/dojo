package com.example.BurgerTracker.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.BurgerTracker.Models.Burger;
import com.example.BurgerTracker.Services.BurgerService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class HomeController {
	
private final BurgerService burgerservice;
    
    public HomeController(BurgerService burgerservice) {
        this.burgerservice = burgerservice;
    }
	
@GetMapping("/")
public String index(@ModelAttribute("burger") Burger burger , HttpSession session ) {
	
	List <Burger> b= burgerservice.findAllBurgers();
	session.setAttribute("burgerss",b);
    return "index.jsp";
}
@PostMapping("/newburger")
public String createBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
    if (result.hasErrors()) {
        return "index.jsp";
    } else {
    	burgerservice.createBurger(burger);
        return "redirect:/";
    }
    

}
@GetMapping("/burgers/edit/{id}")
public String findBurger(@PathVariable("id") Long id, Model model) {
    Burger burger= burgerservice.findBurger(id);
    model.addAttribute("burger", burger);
    return "editburger.jsp";
}

@RequestMapping(value="/burgers/edit/{id}", method=RequestMethod.PUT)
public String update(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model, @PathVariable("id") Long id) {
    if (result.hasErrors()) {
    	model.addAttribute("id",id);
        model.addAttribute("burger", burger);
        return "editburger.jsp";
    } else {
        burgerservice.updateBurger(burger);
        return "redirect:/";
    }
}
}
