package pl.ksiezak.adrian.java.recap.exception;

public class CarException extends Exception{
    public CarException(String message) {
        super(message);
    }

    public CarException(String message, Throwable cause) {
        super(message, cause);
    }
}
