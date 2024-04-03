package Model;

public class typeModel {
    private int code;
    private char name;

    public typeModel(int code, char name) {
        this.code = code;
        this.name = name;
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

}
