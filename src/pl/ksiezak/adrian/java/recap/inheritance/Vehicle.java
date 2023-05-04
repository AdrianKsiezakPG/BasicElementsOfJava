package pl.ksiezak.adrian.java.recap.inheritance;

public class Vehicle {
    private String color;
    private int year;

    public Vehicle() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", year=" + year +
                '}';
    }
}
