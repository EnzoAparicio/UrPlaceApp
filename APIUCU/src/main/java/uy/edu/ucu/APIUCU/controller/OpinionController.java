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

import uy.edu.ucu.APIUCU.Model.Opinion;
import uy.edu.ucu.APIUCU.repository.OpinionRepository;

@RestController
@RequestMapping("/api")
public class OpinionController {
	@Autowired
	private OpinionRepository repository;
	
	@GetMapping("/opinions")
	public List<Opinion> allOpinions(){
		return repository.findAll();
	}
	
	@GetMapping("/opinion/{code}")
	public Opinion getOpinionById(@PathVariable("code") Integer code) {
		return repository.findById(code).get();
	}
	
	@PostMapping("/opinion")
	public Opinion createOpinion(@RequestBody Opinion opinion) {
		return repository.save(opinion);
	}
	
	@DeleteMapping("/opinion/{code}")
	public String deleteOpinion(@PathVariable("code") Integer code) {
		repository.deleteById(code);
		return "Su opinión " + code + " ha sido borrada exitosamente";
	}
	
	@PutMapping("/opinion")
	public Opinion updateOpinion(@RequestBody Opinion opinion) {
		return repository.save(opinion);
	}

}
