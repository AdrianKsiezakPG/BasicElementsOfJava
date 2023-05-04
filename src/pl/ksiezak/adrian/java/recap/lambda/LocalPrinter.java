package pl.ksiezak.adrian.java.recap.lambda;

public class LocalPrinter implements Printer{
    @Override
    public void print(String text) {
        System.out.println("Local printer is printing. " + text);
    }
}
