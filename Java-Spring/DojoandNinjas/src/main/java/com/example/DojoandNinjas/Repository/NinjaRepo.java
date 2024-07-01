package com.example.DojoandNinjas.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.DojoandNinjas.Models.Ninjas;
@Repository
public interface NinjaRepo extends CrudRepository<Ninjas, Long> {

	@Override
	List <Ninjas> findAll();

}
