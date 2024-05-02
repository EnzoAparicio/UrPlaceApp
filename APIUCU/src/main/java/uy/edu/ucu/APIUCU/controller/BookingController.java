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

import uy.edu.ucu.APIUCU.Model.Booking;
import uy.edu.ucu.APIUCU.repository.BookingRepository;

@RestController
@RequestMapping("/api")
public class BookingController {
	@Autowired
	private BookingRepository repository;
	
	@GetMapping("/bookings")
	public List<Booking> allBookings(){
		return repository.findAll();
	}
	
	@GetMapping("/booking/{code}")
	public Booking getBookingById(@PathVariable("code") Integer code) {
		return repository.findById(code).get();
	}
	
	@PostMapping("/booking")
	public Booking createBooking(@RequestBody Booking booking) {
		return repository.save(booking);
	}
	
	@DeleteMapping("/booking/{code}")
	public String deleteBooking(@PathVariable("code") Integer code) {
		repository.deleteById(code);
		return "La reserva " + code + " ha sido cancelada exitosamente";
	}
	
	@PutMapping("/booking")
	public Booking updateBooking(@RequestBody Booking booking) {
		return repository.save(booking);
	}

}