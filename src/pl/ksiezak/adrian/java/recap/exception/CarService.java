package pl.ksiezak.adrian.java.recap.exception;

public class CarService {
    public void fix(String name) throws CarException{
        if(name == null) throw new CarException("Nie podano nazwy samochodu.");
    }
}
