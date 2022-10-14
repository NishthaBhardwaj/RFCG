package com.nishthasoft.stream;

import com.nishthasoft.beforejava8.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStream {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("The Alchemist" , "Paulo Coelho", "Adventure", 4.408789797));
        books.add(new Book("The Notebook" , "Nicholas Sparks", "Romance", 4.10));
        books.add(new Book("Horror Cocktail" , "Robert Bloch", "Horror", 2.67));
        books.add(new Book("House of Leaves" , "Mark Z. Danielewski", "Horror", 4.10908008));
       /*
       So one benefit is with numeric streams is we get some ready mate methemetcal functionality with them
       that we don't have with basic streams
        */
        OptionalDouble average = books.stream()
                .mapToDouble(book -> book.getRating())
                .average();

        System.out.println(average.orElseGet(() -> 0));

        /*
        map -> object if result is int it will box it to Integer  ect
        maptoDouble - it will unbox the double object to prmitive double
        so we have equvelent to map object
        IntStream mapToInt(ToIntFuncation mapper) Integet ----> int
        DoubleStream mapToDouble(ToDoubleFunation mapper) Double -----> double
        LongStream mapToLong(ToLongFuncation mapper) Lont ----> long


         */

        IntStream intS = IntStream.of(1,2,3,4,5);
        DoubleStream doubleStream = DoubleStream.of(1,3,4,5);
        LongStream.of(1L,2L,4L);

        Stream<Integer> boxed = intS.boxed();
        doubleStream.mapToObj(val -> val);


    }
}
