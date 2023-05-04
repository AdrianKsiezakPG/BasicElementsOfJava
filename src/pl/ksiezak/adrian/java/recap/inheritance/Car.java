package pl.ksiezak.adrian.java.recap.inheritance;

import pl.ksiezak.adrian.java.recap.inheritance.homework.Seats;
import pl.ksiezak.adrian.java.recap.inheritance.homework.Wheel;

public class Car extends Vehicle{
    private Wheel wheels;
    private Seats seats;

    public Car() { }

    public Car(Wheel wheels, Seats seats) {
        this.wheels = wheels;
        this.seats = seats;
    }

    public String getWheels() {
        return wheels.toString();
    }

    public void setWheels(Wheel wheels) {
        this.wheels = wheels;
    }

    public String getSeats() {
        return seats.toString();
    }

    public void setSeats(Seats seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels.toString() +
                ", seats=" + seats.toString() +
                "} " + super.toString();
    }
}
