package pl.ksiezak.adrian.java.recap.lambda;

import java.time.LocalDateTime;

public class LocalTimer implements Timer{
    @Override
    public void now() {
        System.out.println("Current time is: " + LocalDateTime.now());
    }
}
