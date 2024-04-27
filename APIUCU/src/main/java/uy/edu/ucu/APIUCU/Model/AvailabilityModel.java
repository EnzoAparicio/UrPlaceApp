package uy.edu.ucu.APIUCU.Model;

import java.util.Date;


public class AvailabilityModel {
    private int code;
    private boolean disponibility;
    private Date date;

    public AvailabilityModel(int code, boolean disponibility, Date date) {
        this.code = code;
        this.disponibility = disponibility;
        this.date = date;
    }
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
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

}
