package com.nishthasoft.stream;

import com.nishthasoft.beforejava8.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ObservingTheStream {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        List<Book> horror = books.stream()  // source
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror")) //Intermediate Operation
                .filter((book) -> book.getRating() > 3) // Intermediate Op
                .collect(Collectors.toList());



        //1. Soruce
        Stream<Book> stream = books.stream();

        //2. Intermediate Operation
        Stream<Book> horrorBook = stream.filter((book) -> book.getGenre().equalsIgnoreCase("Horror"));


        //3. Intermediate Operation
        Stream<Book> popularHorrorBooks = horrorBook.filter((book) -> book.getRating() > 3);

        //4. Terminal Operation
        List<Book> collect = popularHorrorBooks.collect(Collectors.toList());
    }
}
