package domain;
import java.lang.reflect.Array;
import java.util.ArrayList;


public class Concesionario{
    static ArrayList<Car> cars = new ArrayList<>();
    static ArrayList<Van> vans = new ArrayList<>();

    public static void showCarsPrice(){
        double total = 0;
        for(Car c: cars){
            total += c.getPrice();
        }
        System.out.println("El precio total de todos los coches es "+total+ " €.");
    }
    public static void showVansPrice(){
        double total = 0;
        for(Van v: vans){
            total += v.getPrice();
        }
        System.out.println("El precio total de todos las furgonetas es "+total+ " €.");
    }
    public static void showTotalPrice(){
        double total = 0;
        for(Car c: cars){
            total += c.getPrice();
        }
        for(Van v: vans){
            total += v.getPrice();
        }
        System.out.println("El precio total de todo es "+total+ " €.");
    }
}