package domain;

public class Car extends Vehicle{
    public Car(String brand,String model, int base_price, int seats){
        super(brand, model, base_price,seats);
    }
    public String toString(){
        String s = "Marca: "+this.getBrand()+". Modelo: "+this.getModel()+". Precio base: "+this.getBasePrice()+". Precio final: "+this.getPrice()+". Plazas: "+this.getSeats();
        return s;
    }
}