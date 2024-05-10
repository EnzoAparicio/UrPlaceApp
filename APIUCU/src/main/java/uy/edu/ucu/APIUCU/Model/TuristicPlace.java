package uy.edu.ucu.APIUCU.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class TuristicPlace{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_turistic_place;
    private String description;
    private String name;
    private int code_type;
    private int code_city;

    public int getCode() {
        return code_turistic_place;
    }

    public void setCode(int code) {
        this.code_turistic_place = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeType() {
        return code_type;
    }

    public void setCodeType(int codeType) {
        this.code_type = codeType;
    }

	public int getCodeCity() {
		return code_city;
	}

	public void setCodeCity(int codeCity) {
		this.code_city = codeCity;
	}
    
}
