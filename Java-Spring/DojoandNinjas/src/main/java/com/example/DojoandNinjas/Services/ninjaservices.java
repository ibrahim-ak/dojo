package com.example.DojoandNinjas.Services;

import org.springframework.stereotype.Service;

import com.example.DojoandNinjas.Models.Ninjas;
import com.example.DojoandNinjas.Repository.NinjaRepo;
@Service
public class ninjaservices {
	
	private final NinjaRepo ninjarepo;

	ninjaservices(NinjaRepo ninjarepo) {
        this.ninjarepo = ninjarepo;
    }
	 public Ninjas creatNinja(Ninjas ninja) {
	    	return ninjarepo.save(ninja);
	 }
	 
}