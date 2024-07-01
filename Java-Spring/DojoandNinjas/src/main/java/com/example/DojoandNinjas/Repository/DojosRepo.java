package com.example.DojoandNinjas.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoandNinjas.Models.Dojos;
@Repository
public interface DojosRepo extends CrudRepository<Dojos, Long>{

	@Override
	List <Dojos> findAll();
	@Override
	Optional<Dojos> findById(Long id);

	
}
