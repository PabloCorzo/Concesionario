package domain;
import java.util.ArrayList;


public class Concesionario{
    // public static ArrayList<Car> cars = new ArrayList<>();
    // public static ArrayList<Van> vans = new ArrayList<>();
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();
//APLICAR POLIMORFISMO
    public static String getVehicleTotal(){
        double total = 0;
        for(Vehicle v: vehicles){
            total += v.getPrice();
        }
        String x = "El precio total de todos los vehiculos es "+total+ " €.";
        return x;
    }
    public static String getVehicles(){
        String s = "Vehiculos: ";
        for(Vehicle v : vehicles){
            if(vehicles.indexOf(v) == (vehicles.size()-2)){
                s += v.toString();
                s += " y ";
            }
            else if(vehicles.indexOf(v) == (vehicles.size()-1)){
                s+= v.toString();
            }   

            else{
                s += v.toString();
                s += ", ";
            }

        }
        return s;
    }

    public static Car createCar(String brand,String model, int base_price, int seats){
        Car c = new Car(brand, model, base_price, seats);
        return c;
    }
    public static Van createVan(String brand,String model,int base_price, int capacity,int seats){
        Van v = new Van(brand, model, base_price, capacity, seats);
        return v;
    }

}