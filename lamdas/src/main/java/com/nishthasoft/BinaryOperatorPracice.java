package com.nishthasoft;

import java.util.function.BinaryOperator;

public class BinaryOperatorPracice {

    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (a,b) -> a +  ". " + b;
        System.out.println(binaryOperator.apply("hello" , "hee"));

    }
}
