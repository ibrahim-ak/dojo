package com.example.SaveTravels.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.SaveTravels.Modles.Travels;
import com.example.SaveTravels.Repository.TravelRepository;
@Service
public class TravelsServices {

	 private final TravelRepository travelsRepository;
	    
	    public TravelsServices(TravelRepository travelsRepository) {
	        this.travelsRepository = travelsRepository;
	    }
	    
	    public List<Travels> findAllTravels() {
	    	return travelsRepository.findAll();
	    }
	    public Travels createTravel(Travels travel) {
	    	return travelsRepository.save(travel);
	    	
	    }
	    public Travels findtravel(Long id ) {
	    	return travelsRepository.findById(id);
	    }
}
