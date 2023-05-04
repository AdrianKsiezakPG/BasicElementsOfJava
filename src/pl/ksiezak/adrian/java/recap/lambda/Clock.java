package pl.ksiezak.adrian.java.recap.lambda;

public class Clock {
    void currentTime(Timer timer){
        System.out.println("Clock current time is: ");
        timer.now();
    }
}
