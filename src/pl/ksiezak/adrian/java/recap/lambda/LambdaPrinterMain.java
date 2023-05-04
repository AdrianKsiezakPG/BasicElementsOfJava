package pl.ksiezak.adrian.java.recap.lambda;

import java.util.Locale;

public class LambdaPrinterMain {
    public static void main(String[] args) {
//        Printer anonymousPrinter = new Printer() {
//            @Override
//            public void print(String text) {
//                System.out.println("anonymousPrinter " + text);
//            }
//        };
//        Printer lambdaPrinter = (String text) -> System.out.println("lambdaPrinter " + text);
//        Printer lambdaPrinter = (text) -> System.out.println("lambdaPrinter " + text);
//        Printer lambdaPrinter = text -> System.out.println("lambdaPrinter " + text);
//        lambdaPrinter.print("Hello lambda.");


        //homework
        HomeworkPrinter lambdaPrinterHW = new HomeworkPrinter();
//        lambdaPrinterHW.working((String text) -> System.out.println(text));
        lambdaPrinterHW.working((text -> System.out.println(text.toUpperCase())),"hp");

    }
}
// TODO: 05/04/2022 Stworzyc nowa klase z metoda przyjmujaca jako parametr przyjmie interfejs printer (uwaga na parametr string tekst)
