package pl.ksiezak.adrian.java.recap.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class FilesMain {
    public static void main(String[] args) {

        File file1 = new File("plik.txt");
        File file2 = new File("zapisane.txt");

        boolean exists = file1.exists();
        System.out.println("I found this file1:" + exists);

        String absolutePath = file1.getAbsolutePath();
        System.out.println("Path: " + absolutePath);

        System.out.println("Sentens from file1: ");
        try {
            Scanner scanner = new Scanner(file1);
            String line1;
            while(scanner.hasNext()){
                line1 = scanner.nextLine();
                System.out.println(line1);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try {
           List<String> lines = Files.readAllLines(Paths.get("plik.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {

            boolean secendFile = file2.createNewFile();
            System.out.println("I created new file2: " + secendFile);

            PrintWriter printWriter = new PrintWriter(file2);
            printWriter.println("Borys");
            printWriter.println("Agata");
            printWriter.println("Papuga");
            printWriter.close();
//            koniecznie ZAMKNAC !
            System.out.println("I saved everything in file called zapisane.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }


        try(PrintWriter printWriter = new PrintWriter(file2)) {

            boolean secendFile = file2.createNewFile();
            System.out.println("I created new file2: " + secendFile);


            printWriter.println("Borys");
            printWriter.println("Agata");
            printWriter.println("Papuga");
//            printWriter.close();
//            koniecznie ZAMKNAC !
            System.out.println("I saved everything in file called zapisane.txt.");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
