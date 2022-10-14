package com.nishthasoft.stream;

import com.nishthasoft.beforejava8.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleUse {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist" , "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook" , "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail" , "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves" , "Mark Z. Danielewski", "Horror", 4.10908008));


        Stream<Book> booksStream = books.stream();
        List<Book> popularHorrorBook = booksStream
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book) -> book.getRating() > 3)
                .collect(Collectors.toList());

        popularHorrorBook.forEach(System.out::println);

        List<Book> popularRomancticeBook = booksStream
                .filter((book) -> book.getGenre().equalsIgnoreCase("Romance"))
                .filter((book) -> book.getRating() > 3)
                .collect(Collectors.toList());

        popularRomancticeBook.forEach(System.out :: println);

    }
}
