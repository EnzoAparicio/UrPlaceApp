package uy.edu.ucu.APIUCU.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.ucu.APIUCU.Model.City;
import uy.edu.ucu.APIUCU.repository.CityRepository;

@RestController
@RequestMapping("/api")
public class CityController {
	@Autowired
	private CityRepository repository;
	
	@GetMapping("/cities")
	public List<City> allAvailabilitys(){
		return repository.findAll();
	}
	
	@GetMapping("/city/{code}")
	public City getAvailabilityById(@PathVariable("code") Integer code) {
		return repository.findById(code).get();
	}

}
