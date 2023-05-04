package pl.ksiezak.adrian.java.recap.polymorphism;

public class Triangle extends Shape {
    public Triangle(String color, int area) {
        super(color, area);
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
    }
}
