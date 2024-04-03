import java.util.Date;
import java.util.Time;
import 

package Model;

public class availabilityModel {
    private int code;
    private boolean disponibility;
    private date date;
    private time time;

    public availabilityModel(int code, boolean disponibility, date date, time time) {
        this.code = code;
        this.disponibility = disponibility;
        this.date = date;
        this.time = time;
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
    public date getDate() {
        return date;
    }
    public void setDate(date date) {
        this.date = date;
    }
    public time getTime() {
        return time;
    }
    public void setTime(time time) {
        this.time = time;
    }

}
