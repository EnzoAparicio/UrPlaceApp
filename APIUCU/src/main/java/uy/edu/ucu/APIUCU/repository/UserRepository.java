package uy.edu.ucu.APIUCU.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uy.edu.ucu.APIUCU.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {	
	
	Optional<User> findById(Integer codeUser);
	
}