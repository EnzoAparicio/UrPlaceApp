package uy.edu.ucu.APIUCU.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@EntityListeners(AuditingEntityListener.class)
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_city;
    private String name;
    private int code_state;
    private String zone;

    public int getCode() {
        return code_city;
    }

    public void setCode(int code) {
        this.code_city = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCodeState() {
		return code_state;
	}

	public void setCodeState(int codeState) {
		this.code_state = codeState;
	}

	public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

	@Override
	public String toString() {
		return "City [code=" + code_city + ", name=" + name + ", zone=" + zone + "]";
	}

}
