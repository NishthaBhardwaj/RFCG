package com.nishthasoft;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
1. object :: instanceMethod
2. Class::staticMethod
3. Class::instanceMethod
4. Class::new

 */
public class MethodReferencesPractice {

    public static void main(String[] args) {
        //1
        Consumer<String> consumer = System.out :: println;
        consumer.accept("ehllooooo");
        //2
        Supplier<Double> supplier = Math :: random;

        //3
        Function<String, Integer> function = String :: length;

        System.out.println(supplier.get());




    }
}
