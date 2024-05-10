package uy.edu.ucu.APIUCU.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_booking;
	
    private int amount_of_people;
    
    private int code_user;
    
    private double price;
    
    private int code_turistic_place;


    public int getCode() {
        return code_booking;
    }

    public void setCode(int code) {
        this.code_booking = code;
    }

    public int getAmountOfPeople() {
        return amount_of_people;
    }

    public void setAmountOfPeople(int amount_of_people) {
        this.amount_of_people = amount_of_people;
    }

    public int getCodeUser() {
		return code_user;
	}

	public void setCodeUser(int codeUser) {
		this.code_user = codeUser;
	}

	public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

	public int getCode_turistic_place() {
		return code_turistic_place;
	}

	public void setCode_turistic_place(int code_turistic_place) {
		this.code_turistic_place = code_turistic_place;
	}

}
