package uy.edu.ucu.APIUCU.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.edu.ucu.APIUCU.Model.Type;
import uy.edu.ucu.APIUCU.repository.TypeRepository;

@RestController
@RequestMapping("/api")
public class TypeController {
	
	@Autowired
	private TypeRepository repository;
	
	@GetMapping("/types")
	public List<Type> allUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/type/{code}")
	public Type getTypeById(@PathVariable("code") Integer code) {
		return repository.findById(code).get();
	}
	
	
	
}