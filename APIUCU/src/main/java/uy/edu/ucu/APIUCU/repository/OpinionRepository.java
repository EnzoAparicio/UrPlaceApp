package uy.edu.ucu.APIUCU.repository;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.edu.ucu.APIUCU.Model.Opinion;

@Repository
public interface OpinionRepository extends JpaRepository<Opinion, Integer> {	

	Optional<Opinion> findById(Integer code);
		
}
