package com.nishthasoft.stream;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Calculations {

    public static void main(String[] args) {
        //IntStream
        //DoubleStream
        //LongStream

        //sum

        int sum = IntStream.of(1, 2, 4, 6, 7)
                .sum();

        System.out.println(sum);

        // max() optional : primitive

        OptionalInt max = IntStream.of(1, 2, 4, 6, 7).max();

        System.out.println(max.getAsInt());

        //min() : primitive opetional

        OptionalInt min = IntStream.of(1, 2, 4, 6, 7).min();
        System.out.println(min.getAsInt());

        OptionalDouble average = IntStream.of(1, 2, 4, 6, 7).average();

        System.out.println(average.getAsDouble());

        //summaryStatistics
        IntSummaryStatistics intSummaryStatistics = IntStream.of(1, 2, 4, 6, 7).summaryStatistics();
        System.out.println(intSummaryStatistics);
        System.out.println(intSummaryStatistics.getCount());


    }
}
