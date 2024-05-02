package uy.edu.ucu.APIUCU.repository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.edu.ucu.APIUCU.Model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {	

	Optional<Booking> findById(Integer code);
		
}