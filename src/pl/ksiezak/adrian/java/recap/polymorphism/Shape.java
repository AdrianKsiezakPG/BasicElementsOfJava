package pl.ksiezak.adrian.java.recap.polymorphism;

public class Shape {
    private String color;
    private int area;

    public Shape(String color, int area) {
        this.color = color;
        this.area = area;
    }

    public void draw(){
        System.out.println("Drawing a shape.");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", area=" + area +
                '}';
    }
}
