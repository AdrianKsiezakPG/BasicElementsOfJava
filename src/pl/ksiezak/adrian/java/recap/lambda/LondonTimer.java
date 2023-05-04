package pl.ksiezak.adrian.java.recap.lambda;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LondonTimer implements Timer{
    @Override
    public void now() {
        System.out.println("London time is: " + LocalDateTime.now(ZoneId.of("Europe/London")));
    }
}
