package com.nishthasoft.stream;

import com.nishthasoft.beforejava8.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperation {

    public static void main(String[] args) {
        List<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .map((e) -> e * 5)
                .collect(Collectors.toList());

        collect.forEach(System.out :: println);

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist" , "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook" , "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail" , "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves" , "Mark Z. Danielewski", "Horror", 4.10908008));

        // we should not try to change the state of an object using map because in that case
        // we might get concurrentModification exception at run time.
        // and more over we should try to avoid changing the state of an object when using
        // functional programming
        List<String> booksName = books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter(book -> book.getRating() > 3)
                .map(book -> book.getName())
                .collect(Collectors.toList());

        booksName.forEach(System.out :: println);


    }
}
