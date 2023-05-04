package pl.ksiezak.adrian.java.recap.inheritance.homework;

public class Person {
    private String name;
    private int age;
    private boolean healthy;

    public Person() {
    }

    public Person(String name, int age, boolean healthy) {
        this.name = name;
        this.age = age;
        this.healthy = healthy;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", healthy=" + healthy +
                '}';
    }
}
