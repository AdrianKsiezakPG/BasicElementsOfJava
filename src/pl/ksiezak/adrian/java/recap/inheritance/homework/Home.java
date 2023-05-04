package pl.ksiezak.adrian.java.recap.inheritance.homework;


public class Home {

    public static void main(String[] args) {
        Person bob = new Person("bob",20,true);
        System.out.println("New person: " + bob.getName());

        Woman eliza = new Woman("eliza",21,true,"dark");
        System.out.println("New person: " + eliza.getName());
        System.out.println("A little bit of everything about eliza: ");
        System.out.println(eliza);

    }
}
