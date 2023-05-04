package pl.ksiezak.adrian.java.recap.inheritance.homework;

public class InheritanceMain {
    public static void main(String[] args) {
        // Person - typ zmiennej/obiektu
        // ada - nazwa zmiennej/obiektu
        // = - przypisanie wartości
        // new - tworzenie obiektu
        // Woman - typ referencji
        // Woman() - wywołanie konstruktora
        Person ada = new Woman();
        System.out.println("New person: " + ada);
        ada.sayHello();
       // ada.parenting(); tak sie nie da

     Woman ela = new Woman();
     ela.sayHello();
     ela.parenting();
    }
}
// typ zmiennej determinuje jakie metody moga byc wywołane dla obiektu
// typ referencji determinuje, która metoda zostanie wywołana dla obiektu