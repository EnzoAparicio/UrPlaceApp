package uy.edu.ucu.APIUCU.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class State {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code_state;
    private String name;

    public int getCode() {
        return code_state;
    }

    public void setCode(int code) {
        this.code_state = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
