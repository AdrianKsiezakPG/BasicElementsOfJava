package pl.ksiezak.adrian.java.recap.inheritance.homework;

public class Woman extends Person{

    private String hairColor;

    public Woman() {
    }

    public Woman(String name, int age, boolean healthy, String hairColor) {
        super(name, age, healthy);
        this.hairColor = hairColor;
    }

    @Override
    public void sayHello(){
        System.out.println("I am woman.");
    }

    public void parenting(){
        System.out.println("I am pregnant.");
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "hairColor='" + hairColor + '\'' +
                "} " + super.toString();
    }
}
