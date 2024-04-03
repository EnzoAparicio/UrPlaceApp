package Model;

import java.util.Date;
import javax.xml.crypto.Data;


public class availabilityModel {
    private int code;
    private boolean disponibility;
    private Date date;

    public availabilityModel(int code, boolean disponibility, Date date) {
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
