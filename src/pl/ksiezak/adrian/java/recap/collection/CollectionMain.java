package pl.ksiezak.adrian.java.recap.collection;


import java.util.*;

public class CollectionMain {
    public static void main(String[] args) {
        String[] surnames = new String[2];
        surnames[0] = "Ksiezak";
        try {
            surnames[2] = "xyz";
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Surname: " + Arrays.toString(surnames));

        List<String> names = new ArrayList<>();
        names.add("Adrian");
        names.add("Adrian");
        System.out.println("Name: " + names);

        Set<String> ids = new HashSet<>();
        ids.add("1");
        ids.add("1");
        System.out.println("IDs: " + ids);

        PriorityQueue<String> shopQueue = new PriorityQueue<>();
        shopQueue.add("Pani Krysia");
        shopQueue.offer("Pani Jadzia");
        System.out.println("Queue: " + shopQueue);
        String peek = shopQueue.peek();
        System.out.println(peek);
        System.out.println("Queue: " + shopQueue);
        String poll = shopQueue.poll();
        System.out.println(poll);
        System.out.println("Queue: " + shopQueue);

        Map<String, String> people = new TreeMap<>();
        people.put("12345678901", "Ela");
        people.put("12345678901", "Ela");
        System.out.println("People: " + people);
        String s = people.get("12345678901");
        System.out.println("Person: " + s);
    }
}
