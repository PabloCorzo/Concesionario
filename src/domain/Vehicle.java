package domain;

public class Vehicle{
    private String brand;
    private String model;
    private double base_price;
    private double price;
    private int seats;

    public Vehicle(String brand,String model, int base_price, int seats){
        this.brand = brand;
        this.model = model;
        this.base_price = base_price;
        this.seats = seats;
        this.price = setFinalPrice(this.seats);
    }

    public double setFinalPrice(int seats) {
        if (seats <= 5) {
        this.price = this.base_price;
        } 
        else if (seats > 5) {
            int excess = seats - 5;
            for (int i = 0; i < excess; i++) {
                this.price += this.base_price * 0.1;
            }
        }
        return price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setBasePrice(int base_price){
        this.base_price = base_price;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public double getBasePrice(){
        return this.base_price;
    }
    public double getPrice(){
        return this.price;
    }

    public int getSeats(){
        return this.seats;
    }
}