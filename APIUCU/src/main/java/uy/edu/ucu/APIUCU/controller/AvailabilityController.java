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

import uy.edu.ucu.APIUCU.Model.Availability;
import uy.edu.ucu.APIUCU.repository.AvailabilityRepository;

@RestController
@RequestMapping("/api")
public class AvailabilityController {
	@Autowired
	private AvailabilityRepository repository;
	
	@GetMapping("/availabilities")
	public List<Availability> allAvailabilitys(){
		return repository.findAll();
	}
	
	@GetMapping("/availability/{code}")
	public Availability getAvailabilityById(@PathVariable("code") Integer code) {
		return repository.findById(code).get();
	}
	
	@PostMapping("/availability")
	public Availability createAvailability(@RequestBody Availability availability) {
		return repository.save(availability);
	}
	
	@DeleteMapping("/availability/{code}")
	public String deleteAvailability(@PathVariable("code") Integer code) {
		repository.deleteById(code);
		return "La disponibilidad " + code + " ha sido borrado exitosamente";
	}
	
	@PutMapping("/availability")
	public Availability updateAvailability(@RequestBody Availability availability) {
		return repository.save(availability);
	}

}
