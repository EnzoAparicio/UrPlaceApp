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

import uy.edu.ucu.APIUCU.Model.User;
import uy.edu.ucu.APIUCU.repository.UserRepository;

@RestController
@RequestMapping("/api")
public class Controller {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/users")
	public List<User> allUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/person/{code}")
	public User getUserById(@PathVariable("code") Integer code) {
		return repository.getReferenceById(code);
	}
	
}