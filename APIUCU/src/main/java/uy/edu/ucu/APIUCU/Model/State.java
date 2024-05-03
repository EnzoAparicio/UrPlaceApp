package uy.edu.ucu.APIUCU.Model;

public class State {
    private int code;
    private char name;
    private int codeCity;
    private char zone;

    public State(int code, char name, int codeCity, char zone) {
        this.code = code;
        this.name = name;
        this.codeCity = codeCity;
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

    public int getCodeCity() {
        return codeCity;
    }

    public void setCodeCity(int codeCity) {
        this.codeCity = codeCity;
    }

    public char getZone() {
        return zone;
    }

    public void setZone(char zone) {
        this.zone = zone;
    }

}
