package Model;

public class bookingModel {
    private int code;
    private int amountOfPeople;
    private double price;

    public bookingModel(int code, int amountOfPeople, double price) {
        this.code = code;
        this.amountOfPeople = amountOfPeople;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getAmountOfPeople() {
        return amountOfPeople;
    }

    public void setAmountOfPeople(int amountOfPeople) {
        this.amountOfPeople = amountOfPeople;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
