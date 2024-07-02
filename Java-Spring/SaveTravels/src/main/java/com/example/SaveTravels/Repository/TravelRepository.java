package com.example.SaveTravels.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SaveTravels.Modles.Travels;
@Repository
public interface TravelRepository extends CrudRepository<Travels, Long>{
	

	@Override
	List<Travels> findAll();
	
	@Override
	Optional<Travels> findById(Long id);
}
