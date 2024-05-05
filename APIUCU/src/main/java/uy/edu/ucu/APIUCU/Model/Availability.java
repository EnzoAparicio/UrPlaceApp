package uy.edu.ucu.APIUCU.Model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Availability {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_availability;
	
    private boolean disponibility;
    
    private Date date;
    
    public int getCode() {
		return code_availability;
	}

	public void setCode(int code) {
		this.code_availability = code;
	}

	public boolean isDisponibility() {
		return disponibility;
	}

	public void setDisponibility(boolean disponibility) {
		this.disponibility = disponibility;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Availability [code=" + code_availability + ", disponibility=" + disponibility + ", date=" + date + "]";
	}

}
