package pl.ksiezak.adrian.java.recap.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Vehicle schoolBus = new Vehicle();
        System.out.println("Autobus szkolny: " + schoolBus);

        Car audi = new Car();
        System.out.println("Samochod osobowy: " + audi);

        Vehicle toyota = new Car();
        System.out.println("Samochod to: " + toyota);
    }
}
// TODO: 11/03/2022  W oddzielnym pakiecie zaprezentuj dziedziczenie dla nowo utworzonych klas. Jedna z nich to POJO.