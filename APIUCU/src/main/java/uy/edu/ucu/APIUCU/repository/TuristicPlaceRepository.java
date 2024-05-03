package uy.edu.ucu.APIUCU.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.edu.ucu.APIUCU.Model.TuristicPlace;

@Repository
public interface TuristicPlaceRepository extends JpaRepository<TuristicPlace, Integer> {	

	Optional<TuristicPlace> findById(Integer code);
		
}