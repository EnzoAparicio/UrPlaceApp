package uy.edu.ucu.APIUCU.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.edu.ucu.APIUCU.Model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {	

	Optional<City> findById(Integer code);
		
}