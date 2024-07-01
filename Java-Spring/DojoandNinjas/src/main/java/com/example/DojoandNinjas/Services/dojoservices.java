package com.example.DojoandNinjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.DojoandNinjas.Models.Dojos;
import com.example.DojoandNinjas.Repository.DojosRepo;

@Service

public class dojoservices {
private final DojosRepo dojorepository;

    dojoservices(DojosRepo dojorepository) {
        this.dojorepository = dojorepository;
    }
    public Dojos creatDojo(Dojos dojo) {
    	return dojorepository.save(dojo);
    	
    	
    }
    public List<Dojos> findAllDojos() {
    return	dojorepository.findAll();
    }
 
    public Dojos findById(Long id) {
    	 Optional<Dojos> dojo= dojorepository.findById(id);
         if(dojo.isPresent()) {
             return dojo.get();
         } else {
             return null;
         }
}
    }
    

