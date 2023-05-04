package pl.ksiezak.adrian.java.recap.lambda;


public class LambdaMain {
    public static void main(String[] args) {
        Printer hp =new LocalPrinter();
        hp.print("Hello");

        Timer localTimer = new LocalTimer();
        localTimer.now();

        Clock clock = new Clock();
        clock.currentTime(localTimer);

        Timer londonTimer = new LondonTimer();
        londonTimer.now();

        clock.currentTime(londonTimer);

        ////////////////////////

        Timer anonymousTimer = new Timer() {
            @Override
            public void now() {
                System.out.println("anonymousTimer");
            }
        };
        clock.currentTime(anonymousTimer);

        //////////////////////

       Timer lambdaTimer = () -> System.out.println("lambdaTimer");
       clock.currentTime(lambdaTimer);

       Timer anonymousLambdaTimer = () -> System.out.println("anonymousLambdaTimer");
       clock.currentTime(anonymousLambdaTimer);

       clock.currentTime(() -> System.out.println("Inner lambda."));



    }
}
