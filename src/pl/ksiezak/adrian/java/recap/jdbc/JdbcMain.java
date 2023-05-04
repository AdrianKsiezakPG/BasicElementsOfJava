package pl.ksiezak.adrian.java.recap.jdbc;

import java.util.Scanner;

public class JdbcMain {

    public static void menu(){
        System.out.println("1. Show list.");
        System.out.println("2. Create new element of list.");
        System.out.println("3. Read list.");
        System.out.println("4. Delete element of list.");
        System.out.println("0. Finish.");
    }

    public static void main(String[] args) {
        AnimalDao dao = new AnimalDao();
        Element element = new Element(100,"yyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me number: ");
        int id = scanner.nextInt();
        System.out.println("Give me name: ");
        String name = scanner.next();
        dao.read(id);
        dao.list();
//        menu();
//        int number = -1;
//        while (number != 0) {
//            switch (number) {
//                case 0:
//                    System.out.println("Bye");
//                    break;
//                case 1:
//                    dao.list();
//                    break;
//                case 2:
//                    dao.create();
//                    break;
//                case 3:
//                    dao.read();
//                    break;
//                case 4:
//                    dao.update();
//                    break;
//                case 5:
//                    dao.delete();
//                    break;
//            }
//        }
    }
}
