package com.nishthasoft.stream;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOperation {

    public static void main(String[] args) {
        /*
        this of() method is a static method of stream class that can create a stream of the element pass
        to it. This of() is varArg method that it can take any number of arguments and we can create any type of
        stream using this of(). We can create stream of String, Integers etc.. we can create stream of any type of
        objects
         */
        Stream.of(3, 45, 6, 30, 4, 65, 71, 34)
                .filter((num) -> num % 2 == 0)
                .forEach(System.out :: println);
    }
}
