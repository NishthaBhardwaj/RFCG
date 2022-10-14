package com.nishthasoft.stream;

import com.nishthasoft.beforejava8.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Laziness {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist" , "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook" , "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail" , "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves" , "Mark Z. Danielewski", "Horror", 4.10908008));

        Stream<Book> stream = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .peek(book -> System.out.println("Filtered Bood " + book))
                .filter(book -> book.getRating() > 3);

        System.out.println("Filtering done..");

    }

    // this is how streams are lazy. Stream pipe line gets triggered only when the terminal operations are applied.
    // and Terminal operation on stream are eager it execute the complete pipeline right at time apply it.
    // so always remember intermediate operation on streams are lozy and terminal operations are eager.
    private static void collect(Stream<Book> stream){
        List<Book> collect = stream.collect(Collectors.toList());
        System.out.println("Collection done..");
        collect.forEach(System.out :: println);
    }


}
