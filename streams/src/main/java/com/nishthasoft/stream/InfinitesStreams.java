package com.nishthasoft.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfinitesStreams {

    public static void main(String[] args) {

        Stream.iterate(0, i -> i+1);

        IntStream.iterate(0, i -> i - 1)
                .limit(20)
                .forEach(System.out :: println);

        Stream.generate(() -> new Random().nextInt())
                .limit(30).forEach(System.out :: println);


        ;
    }
}
