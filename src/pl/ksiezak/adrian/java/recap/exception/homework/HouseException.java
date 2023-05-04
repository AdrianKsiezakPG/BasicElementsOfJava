package pl.ksiezak.adrian.java.recap.exception.homework;

public class HouseException extends Exception{

    public HouseException(String message) {
        super(message);
    }

    public HouseException(String message, Throwable cause) {
        super(message, cause);
    }
}
