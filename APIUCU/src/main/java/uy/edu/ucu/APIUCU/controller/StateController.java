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

import uy.edu.ucu.APIUCU.Model.State;
import uy.edu.ucu.APIUCU.repository.StateRepository;

@RestController
@RequestMapping("/api")
public class StateController {
	@Autowired
	private StateRepository repository;
	
	@GetMapping("/state")
	public List<State> allStates(){
		return repository.findAll();
	}
	
	@GetMapping("/state/{code}")
	public State getStateById(@PathVariable("code") Integer code) {
		return repository.findById(code).get();
	}
	
	@PostMapping("/State")
	public State createState(@RequestBody State state) {
		return repository.save(state);
	}
	
	@DeleteMapping("/state/{code}")
	public String deleteState(@PathVariable("code") Integer code) {
		repository.deleteById(code);
		return "El departamento " + code + " ha sido borrado exitosamente";
	}
	
	@PutMapping("/state")
	public State updateState(@RequestBody State state) {
		return repository.save(state);
	}

}