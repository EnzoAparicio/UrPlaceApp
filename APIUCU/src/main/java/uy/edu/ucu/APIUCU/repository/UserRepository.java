package uy.edu.ucu.APIUCU.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import uy.edu.ucu.APIUCU.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	User getReferenceById(Integer code);

}