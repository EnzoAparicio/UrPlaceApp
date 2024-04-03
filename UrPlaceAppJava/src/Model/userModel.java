package Model;

public class userModel {
    private int code;
    private char name;
    private char lastName;
    private char email;
    private char password;
    private char cellphone;

    public userModel(int code, char name, char lastName, char email, char password, char cellphone) {
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.cellphone = cellphone;
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

    public char getLastName() {
        return lastName;
    }

    public void setLastName(char lastName) {
        this.lastName = lastName;
    }

    public char getEmail() {
        return email;
    }

    public void setEmail(char email) {
        this.email = email;
    }

    public char getPassword() {
        return password;
    }

    public void setPassword(char password) {
        this.password = password;
    }

    public char getCellphone() {
        return cellphone;
    }

    public void setCellphone(char cellphone) {
        this.cellphone = cellphone;
    }
}
