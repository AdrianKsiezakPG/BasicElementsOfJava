package pl.ksiezak.adrian.java.recap.lambda;

public class LambdaRouterMain {
    public static void main(String[] args) {
        Router anonymousRouter = new Router() {
            @Override
            public String route(String trace) {
                return "Routing " + trace;
            }
        };
        String xyz = anonymousRouter.route("Start");
        System.out.println(xyz);
//        Router lambdaRouter = (text) -> System.out.println("lambda" + );
        Router lambdaRouter = (text) -> {
            return "anonymous " + text;
        };
        Router lambdaInLineRouter = (text) -> "anonymous " + text;

        String ww = lambdaRouter.route("end");
        System.out.println(ww);


        ///homework
        HomeworkRouter homeworkRouter = new HomeworkRouter();
        homeworkRouter.test(abc -> abc.toUpperCase(),"router");

    }
}

// TODO: 05/04/2022 Stworzyc nowa klase z metoda przyjmujaca jako parametr przyjmie interfejs router (uwaga na parametr string tekst)
