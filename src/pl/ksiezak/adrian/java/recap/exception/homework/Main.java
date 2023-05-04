package pl.ksiezak.adrian.java.recap.exception.homework;

import pl.ksiezak.adrian.java.recap.exception.homework.FamilyHouse;
import pl.ksiezak.adrian.java.recap.exception.homework.HouseException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FamilyHouse familyHouse = new FamilyHouse();
        System.out.println("Give me odp. Does house is clear ? (Yes or No)");
        String odp = scanner.next();
        try{
            familyHouse.clear(odp);
        }catch(HouseException e){
            e.printStackTrace();
        }
        System.out.println("You have to clean all house now!");
    }
}
