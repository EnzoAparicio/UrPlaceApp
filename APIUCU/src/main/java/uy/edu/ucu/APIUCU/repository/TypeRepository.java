package uy.edu.ucu.APIUCU.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.edu.ucu.APIUCU.Model.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Integer> {	

	Optional<Type> findById(Integer code);
		
}