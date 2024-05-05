package uy.edu.ucu.APIUCU.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Type {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_type;
    private String name;

    public int getCode() {
        return code_type;
    }

    public void setCode(int code) {
        this.code_type = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
