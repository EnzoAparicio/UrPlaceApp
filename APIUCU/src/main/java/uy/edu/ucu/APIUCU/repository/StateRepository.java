package uy.edu.ucu.APIUCU.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.edu.ucu.APIUCU.Model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {	

	Optional<State> findById(Integer code);
		
}
