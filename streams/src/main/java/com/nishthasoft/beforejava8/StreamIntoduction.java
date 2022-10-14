package com.nishthasoft.beforejava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntoduction {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        List<Book> popularHorrorBook = new ArrayList<>();

        for(Book book: books){
            if(book.getGenre().equalsIgnoreCase("Horror") && book.getRating() > 3){
                popularHorrorBook.add(book);

            }
        }
        //stream
        List<Book> horror = books.stream()
                .filter((book) -> book.getGenre().equalsIgnoreCase("Horror"))
                .filter((book) -> book.getRating() > 3)
                .collect(Collectors.toList());
    }
}
