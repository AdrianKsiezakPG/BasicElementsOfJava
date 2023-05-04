package pl.ksiezak.adrian.java.recap.inheritance;

import pl.ksiezak.adrian.java.recap.inheritance.homework.Seats;
import pl.ksiezak.adrian.java.recap.inheritance.homework.Wheel;

public class ConstructorVsSetterMain {
    public static void main(String[] args) {
        Car dacia = new Car(new Wheel(4,15),new Seats(5));
        System.out.println("Dacia: " + dacia);
        dacia.setSeats(new Seats(5));
        dacia.setWheels(new Wheel(4,16));
        System.out.println("Dacia po kontroli: " + dacia.toString());

        Car audi = new Car(new Wheel(4,20),new Seats(4));
        System.out.println("Audi: " + audi.toString());
    }
}
// TODO: 18/03/2022 Klasa Car zamiast typów int będzie używać własnych klas Wheel oraz Seat
// Zatępujemy typy proste typami złożonymi
// Zaprezentuj różnice między typem zmiennej a typem referencji
// Zrobić 3 zad z codewars
// https://www.codewars.com/kata/55a75e2d0803fea18f00009d
