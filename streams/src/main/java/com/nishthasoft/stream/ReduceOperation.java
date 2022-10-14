package com.nishthasoft.stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/*
Many time we need to perform the operations where stream reduces a single result in value
for eg. to find the some of all the stream elements. to find product of al the stream elements
to find the max, min etc.
for that we have reduce() in stream api
fo reducing is repeted process to combining all the elements

T reduce(<T> identity, BinaryOperator)
identity
0 + 9 = 9 sum
1 * 9 = 9 multification
so this is how we can identify the identity value for the operations
that we are going to to use in the implementation in the BinaryOperator or in the accumulator

 */
public class ReduceOperation {

    public static void main(String[] args) {

        Integer sum = Stream.of(1, 2, 34, 35, 67, 89, 12, 34)
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);



        /*
        1,2,34,35,67,89,12,34

        0,((0,1) -> 0 + 1)
        ((1,2) -> 1 + 2)
        ((3,34) -> 3 + 34)
        ((37,35) -> 37 + 35
         */

    }




}
