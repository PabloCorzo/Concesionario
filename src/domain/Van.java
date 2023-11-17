package domain;

public class Van extends Vehicle{

    private int capacity; 
    double final_price;

    public Van(String brand,String model,int base_price, int capacity,int seats){
        super(brand, model, base_price,seats);
        this.capacity = capacity;
        this.final_price = this.setFinalPrice();
    }

    public double setFinalPrice(){
        double cube = Math.cbrt(this.capacity);
        double base_price = this.getBasePrice();
        this.final_price = base_price*(cube/2);
        return this.final_price;    
    }

    public String toString(){
        String s ="Marca: "+this.getBrand()+". Modelo: "+this.getModel()+". Precio base: "+this.getBasePrice()+". Precio final: "+this.getPrice()+". Capacidad: "+this.capacity+". Plazas: "+this.getSeats(); 
        return s;
    }

}