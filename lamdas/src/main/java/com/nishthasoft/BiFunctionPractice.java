package com.nishthasoft;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {

        BiFunction<String,String,String> biFunction = (a,b) -> a + b;
        BiFunction<String,String,Integer> lenth = (a,b) -> (a + b).length();

        System.out.println(biFunction.apply("Hello"," how are you"));
        System.out.println(lenth.apply("hey ", "hi"));

    }
}
