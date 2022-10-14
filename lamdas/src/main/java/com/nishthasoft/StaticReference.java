package com.nishthasoft;

import java.util.function.BiFunction;

public class StaticReference {

    public static void main(String[] args) {

        BiFunction<String,String,String> biFunction = (a,b) -> A_Class.staticMethod(a,b);

        BiFunction<String,String,String> biFunction1 = A_Class :: staticMethod;

        System.out.println(biFunction.apply("Bi", " Function"));
        System.out.println(biFunction1.apply("Bi", " Function  -"));
    }
}


class A_Class{
    static String staticMethod(String a, String b){
        return a+b;
    }
}
