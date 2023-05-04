package pl.ksiezak.adrian.java.recap.polymorphism;

public class PolymorphismMain {
    public static void main(String[] args) {
        Shape shape = new Shape("white",20);
        shape.draw();
        Square square = new Square("black",12);
        square.toString();
        Shape triangle = new Triangle("yellow",5);
        triangle.draw();

        // typ zmiennej determinuje jakie metody moga byc wywołane dla obiektu
        // typ referencji determinuje, która metoda zostanie wywołana dla obiektu
    }
}
