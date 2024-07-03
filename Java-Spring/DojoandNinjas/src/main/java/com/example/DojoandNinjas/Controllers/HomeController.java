package com.example.DojoandNinjas.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.DojoandNinjas.Models.Dojos;
import com.example.DojoandNinjas.Models.Ninjas;
import com.example.DojoandNinjas.Services.dojoservices;
import com.example.DojoandNinjas.Services.ninjaservices;

import jakarta.validation.Valid;

@Controller
public class HomeController {
	@Autowired
	dojoservices dojoservice;
	@Autowired
	ninjaservices ninjaservices;
	@GetMapping("/dojos/new")
	public String dojoIndex(@ModelAttribute("dojo") Dojos dojo) {

		return "Dojos/DojoCreation.jsp";
	}

	@PostMapping("/dojos/new")
	public String creatDojo(@Valid @ModelAttribute("dojo") Dojos dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "Dojos/DojoCreation.jsp";
		} else {
			dojoservice.creatDojo(dojo);
			return "redirect:/Dashboard";
		}

	}

	@GetMapping("/ninjas/new")
	public String ninjaIndex(@ModelAttribute("ninja") Ninjas ninja , Model model) {
		List<Dojos> dojo = dojoservice.findAllDojos();
		model.addAttribute("dojos",dojo);
		return "Ninjas/NinjaCreation.jsp";

	}

	@PostMapping("/ninjas/new")
	public String creatNinja(@Valid @ModelAttribute("ninja") Ninjas ninja, BindingResult result,Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos",dojoservice.findAllDojos());
			return "Ninjas/NinjaCreation.jsp";
		} else {
			ninjaservices.creatNinja(ninja);
			return "redirect:/Dashboard";
		}

	}
	@GetMapping("/Dashboard")
	public String DashboardIndex( Model model) {
		List<Dojos> dojo = dojoservice.findAllDojos();
		model.addAttribute("dojos",dojo);
		return "DashBoard.jsp";

}
	@GetMapping("/dojo/{id}")
	public String pagedojo(@PathVariable("id") Long id,  Model model) {
		List<Dojos> dojos = dojoservice.findAllDojos();
		 Dojos dojoid =  dojoservice.findById(id);
		model.addAttribute("dojoid",dojoid );
		model.addAttribute("dojos",dojos );
		return "dojopage.jsp";

}
	}
