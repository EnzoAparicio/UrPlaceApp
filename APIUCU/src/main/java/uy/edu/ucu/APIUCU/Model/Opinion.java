package uy.edu.ucu.APIUCU.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Opinion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code_opinion;
    private int code_user;
    private int code_turistic_place;
    private String comment;
    private int star;

    public int getCode() {
        return code_opinion;
    }

    public void setCode(int code) {
        this.code_opinion = code;
    }

    public int getCodeUser() {
        return code_user;
    }

    public void setCodeUser(int codeUser) {
        this.code_user = codeUser;
    }

    public int getCode_turistic_place() {
		return code_turistic_place;
	}

	public void setCode_turistic_place(int code_turistic_place) {
		this.code_turistic_place = code_turistic_place;
	}

	public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

}
