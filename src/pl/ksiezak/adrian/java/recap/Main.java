package pl.ksiezak.adrian.java.recap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dane: ");
        String nextLine = scanner.nextLine();
        System.out.println("Wartosc pobrana: " + nextLine);

    }
}
