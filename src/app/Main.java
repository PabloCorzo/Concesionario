package app;
import user_interface.*;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Interface i = new Interface();
    public static void main(String[] args) {
        String input = getInput();
        if(input.split(" ")[0].equalsIgnoreCase("salir")){
            i.Save();
        }
        else{
            i.run(input);
            main(args);
        }
    }
    public static String getInput(){
        String input = null;
        /*while(sc.hasNextLine()){*/System.out.println("Que desea hacer?");
        input = sc.nextLine();
        // };
        return input;
    }
}
