package com.assignments.BeltReview.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignments.BeltReview.Models.Project;
import com.assignments.BeltReview.Models.User;
import com.assignments.BeltReview.repositories.ProjectRepository;

import jakarta.validation.Valid;

@Service
public class ProjectService {
@Autowired
ProjectRepository prepo;
	public void createProject(Project project,User user) {
		project.setLead(user);
		project.getUsers().add(user);
		 prepo.save(project);
		
	}
	public List<Project> findAllProjects() {
	return	prepo.findAll();
	}
	public List<Project> findRemaining(User user){
		return prepo.findByUsersNotContains(user);
	}
	public List<Project> findUserProjects(User user1) {
		return prepo.findByUsersContains(user1);
	}
	public Project findByid(Long id) {
		Optional<Project> op = prepo.findById(id);
		if (op.isPresent()) {
			return op.get();
		}
		return null;
	}
	public Project Update(Project project) {
		Optional<Project> op = prepo.findById(project.getId());
		if (op.isPresent()) {
			return prepo.save(project);
		}
		return null;
	}
	public void leaveteam(Project project, User user) {
		project.getUsers().remove(user);
		prepo.save(project);
		
	}
	public void deleteByid(Long id) {
		prepo.deleteById(id);
		
	}
	
}
