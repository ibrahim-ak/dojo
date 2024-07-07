package com.assignments.BeltReview.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignments.BeltReview.Models.Project;
import com.assignments.BeltReview.Models.User;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	List <Project> findAll();
	
	List<Project> findByUsersNotContains(User user);
	List<Project> findByUsersContains(User user);

}
