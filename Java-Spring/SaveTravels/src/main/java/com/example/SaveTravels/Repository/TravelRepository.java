package com.example.SaveTravels.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SaveTravels.Modles.Travels;
@Repository
public interface TravelRepository extends CrudRepository<Travels, Long>{
	

	@Override
	List<Travels> findAll();
	
	

	@Override
	Travels findById(Long id);
}
