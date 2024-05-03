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

import uy.edu.ucu.APIUCU.Model.TuristicPlace;
import uy.edu.ucu.APIUCU.repository.TuristicPlaceRepository;

@RestController
@RequestMapping("/api")
public class TuristicPlaceController {
	@Autowired
	private TuristicPlaceRepository repository;
	
	@GetMapping("/turisticPlaces")
	public List<TuristicPlace> allTuristicPlaces(){
		return repository.findAll();
	}
	
	@GetMapping("/turisticPlace/{code}")
	public TuristicPlace getTuristicPlaceById(@PathVariable("code") Integer code) {
		return repository.findById(code).get();
	}
	
	@PostMapping("/turisticPlace")
	public TuristicPlace createTuristicPlace(@RequestBody TuristicPlace turisticPlace) {
		return repository.save(turisticPlace);
	}
	
	@DeleteMapping("/turisticPlace/{code}")
	public String deleteTuristicPlace(@PathVariable("code") Integer code) {
		repository.deleteById(code);
		return "El lugar turísitico " + code + " ha sido borrado exitosamente";
	}
	
	@PutMapping("/turisticPlace")
	public TuristicPlace updateTuristicPlace(@RequestBody TuristicPlace turisticPlace) {
		return repository.save(turisticPlace);
	}

}