package pl.ksiezak.adrian.java.recap.streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsMain {
    public static void main(String[] args) {
        List<BoardGame> games = new ArrayList<>();//Arrays.asList(
               games.add(new BoardGame("aaa", 8.38, new BigDecimal("123.49"), 1, 50));
                games.add(new BoardGame("bbb", 7.38, new BigDecimal("65.77"), 2, 3));
                games.add(new BoardGame("ccc", 8.38, new BigDecimal("144.44"), 1, 10));
               games.add(new BoardGame("ddd", 8.38, new BigDecimal("55.55"), 1, 6));
                games.add(new BoardGame("eee", 9.38, new BigDecimal("129.22"), 1, 2));
        //);

        games.stream()
                .filter(g -> g.maxPlayers > 4)
                .filter(g -> g.rating > 8)
                .filter(g -> new BigDecimal(150).compareTo(g.price) > 0)
                .map(g -> g.name.toUpperCase())
                .forEach(System.out::println);

        List<BoardGame> collect = games.stream()
                .collect(Collectors.toList());
        System.out.println("All board games: " + collect);

        List<BoardGame> boardGamesFourPlayers = games.stream()
                .filter(g -> g.maxPlayers > 4)
                .collect(Collectors.toList());
        System.out.println("Four players: " + boardGamesFourPlayers);

        Predicate<String> predicateName = (name) -> name.contains("aaa");
        List<String> names = Arrays.asList("Ania", "aaa", "Tomek");
        List<String> filteredNames = names.stream()
                .filter(predicateName)
                .collect(Collectors.toList());
        System.out.println("Names: " + filteredNames);

        Predicate<BoardGame> boardGameNamePredicate = (bg) -> bg.name.contains("aaa");
        List<BoardGame> boardGamesByName = games.stream()
                .filter(boardGameNamePredicate)
                .collect(Collectors.toList());
        System.out.println("Games name : " + boardGamesByName);

        Function<BoardGame,String> boardGameNameFunction = (bg) -> bg.name;

        List<String> boardGameNames = games.stream()
                .map(boardGameNameFunction)
                .collect(Collectors.toList());
        System.out.println("Board game names: " + boardGameNames);

//homework

        games.stream()
                .filter(g -> g.rating >= 8 )
                .filter(g -> g.minPlayers >= 2)
                .map(g -> g.name.toUpperCase())
                .forEach(System.out::println);


        Predicate<BoardGame> homeworkPredicate = (bb) -> bb.rating >= 8;
        List<BoardGame> boardGamesByRating = games.stream()
                .filter(homeworkPredicate)
                .collect(Collectors.toList());
        System.out.println("Homework : " + boardGamesByRating);


        try{
            for(BoardGame g :games){
                if(g.maxPlayers % 10 == 0){
                    games.remove(g);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

// TODO: 20/04/2022  Zaprezentowac wyjatek ConcurrentModificationException korzystjac z petli for w ktorej usuwamy elementy
//Zaprezentuj dzialanie filter i map dla tego samego strumienia uzywajac recznie stworzonych lambd
// TODO: 27/04/2022 zaimplementuj rozwiazanie ConcurrentModificationException (solutions)