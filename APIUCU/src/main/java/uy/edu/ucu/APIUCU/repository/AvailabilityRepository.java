package uy.edu.ucu.APIUCU.repository;
import java.util.List;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.edu.ucu.APIUCU.Model.Availability;

@Repository
public interface AvailabilityRepository extends JpaRepository<Availability, Integer> {	

	Optional<Availability> findById(Integer code);
		
}