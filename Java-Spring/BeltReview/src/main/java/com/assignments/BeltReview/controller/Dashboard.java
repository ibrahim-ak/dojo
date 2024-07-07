package com.assignments.BeltReview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.assignments.BeltReview.Models.LogIn;
import com.assignments.BeltReview.Models.Project;
import com.assignments.BeltReview.Models.User;
import com.assignments.BeltReview.service.ProjectService;
import com.assignments.BeltReview.service.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class Dashboard {
	@Autowired
	UserService userservice;
	@Autowired
	ProjectService pservice;

	@GetMapping("/welcome")
	public String welcomePage(HttpSession session, Model model) {

		if (session.getAttribute("Theuser") == null) {
			return "redirect:/";
		}
		Long loginuser = (Long) session.getAttribute("Theuser");

		User user1 = userservice.findById(loginuser);

		String username = user1.getUserName();
		model.addAttribute("userName", username);

		List<Project> projects = pservice.findUserProjects(user1);
		List<Project> otherProjects = pservice.findRemaining(user1);
		model.addAttribute("otherProjects", otherProjects);
		model.addAttribute("Projects", projects);
		return "Welcome.jsp";
	}

	@GetMapping("/project/new")
	public String addProject(@ModelAttribute("newproject") Project project) {

		return "createproject.jsp";

	}

	@PostMapping("/project/new")
	public String createproject(@Valid @ModelAttribute("newproject") Project project, BindingResult result,
			HttpSession session) {
		if (session.getAttribute("Theuser") == null) {

			return "redirect:/";
		} else if (result.hasErrors()) {

			return "createproject.jsp";
		} else {
			Long userId = (Long) session.getAttribute("Theuser");
			User logedUser = userservice.findById(userId);
			pservice.createProject(project, logedUser);

			return "redirect:/welcome";
		}
	}

	@GetMapping("/jointeam/{projectid}")
	public String joinTeam(@PathVariable("projectid") Long id, HttpSession session) {
		if (session.getAttribute("Theuser") == null) {

			return "redirect:/";
		}
		User user = (User) userservice.findById((Long) session.getAttribute("Theuser"));

		Project project = pservice.findByid(id);
		project.getUsers().add(user);
		pservice.Update(project);

		return "redirect:/welcome";

	}

	@GetMapping("/leaveteam/{projectid}")
	public String leaveTeam(@PathVariable("projectid") Long id, HttpSession session) {
		if (session.getAttribute("Theuser") == null) {

			return "redirect:/";
		}
		Project project = pservice.findByid(id);
		User user = (User) userservice.findById((Long) session.getAttribute("Theuser"));
		pservice.leaveteam(project, user);

		return "redirect:/welcome";
	}

	@GetMapping("/projects/edit/{id}")
	public String getEdit(@PathVariable("id") Long id, HttpSession session, Model model) {
		if (session.getAttribute("Theuser") == null) {

			return "redirect:/";
		}
		Project project = pservice.findByid(id);
		model.addAttribute("Eproject", project);

		return "projectEdit.jsp";

	}

	@PatchMapping("/projects/edit/{id}")
	public String editProject(@Valid @ModelAttribute("Eproject") Project project,BindingResult result, @PathVariable("id") Long id,
			HttpSession session,Model model) {
		if (session.getAttribute("Theuser") == null) {

			return "redirect:/";
		}
		if (result.hasErrors()) {
//			model.addAttribute("Eproject", project);
			return "projectEdit.jsp";
		}
		Project EditedProject = pservice.findByid(id);
		EditedProject.setTitle(project.getTitle());
		EditedProject.setDescription(project.getDescription());
		EditedProject.setDueDate(project.getDueDate());
		pservice.Update(EditedProject);
		

		return "redirect:/welcome";
	}

	@GetMapping("/delete/{deleteproject}")
	public String deleteProject(@PathVariable("deleteproject")Long id) {
		
		pservice.deleteByid(id);
		return "redirect:/welcome";
		
		
	}
	
}
