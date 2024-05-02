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
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping("/users")
	public List<User> allUsers(){
		return repository.findAll();
	}
	
	@GetMapping("/user/{code}")
	public User getUserById(@PathVariable("code") Integer code) {
		return repository.findById(code).get();
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user) {
		return repository.save(user);
	}
	
	@DeleteMapping("/user/{code}")
	public String deleteUser(@PathVariable("code") Integer code) {
		repository.deleteById(code);
		return "El usuario " + code + " ha sido borrado exitosamente";
	}
	
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return repository.save(user);
	}
	
}