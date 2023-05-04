package pl.ksiezak.adrian.java.recap.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExceptionMain {
    public static void main(String[] args) {
        System.out.println("Program startuje.");
        String[] names = new String[2];
        try {
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
       }
        System.out.println("Program dalej działa");

        try {
            Files.readAllLines(Paths.get("plik.txt"));
       } catch (IOException e) {
           e.printStackTrace();
       }
        System.out.println("Po odczytaniu pliku.");

        CarService carService = new CarService();
        try {
            carService.fix(null);
        } catch (CarException e) {
            e.printStackTrace();
        }
    }
}
