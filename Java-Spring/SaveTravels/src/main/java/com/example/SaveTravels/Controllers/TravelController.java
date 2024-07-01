package com.example.SaveTravels.Controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SaveTravels.Modles.Travels;
import com.example.SaveTravels.Services.TravelsServices;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	 private final TravelsServices travelsServices;
	    public TravelController(TravelsServices travelsServices){
	        this.travelsServices = travelsServices;
	    }
	    
@GetMapping("/")
public String index( @ModelAttribute("travels") Travels travel,Model model) {
		List <Travels> travel1 = travelsServices.findAllTravels();
		model.addAttribute("Travels",travel1);
		return "index.jsp";
	
}

@PostMapping("/newtravel")
public String createBurger(@Valid @ModelAttribute("travels") Travels travel, BindingResult result) {
    if (result.hasErrors()) {
        return "index.jsp";
    } else {
    	travelsServices.createTravel(travel);
        return "redirect:/";
    }	    
}
@GetMapping("/expenses/edit/{id}")
public String findTravel(@PathVariable("id") Long id, Model model) {
    Travels travel= travelsServices.findtravel(id);
    model.addAttribute("travel", travel);
    return "edittravel.jsp";

   
}


}
