package uy.edu.ucu.APIUCU.Model;

public class cityModel {
    private int code;
    private char name;
    private char zone;

    public cityModel(int code, char name, char zone) {
        this.code = code;
        this.name = name;
        this.zone = zone;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public char getZone() {
        return zone;
    }

    public void setZone(char zone) {
        this.zone = zone;
    }

}
