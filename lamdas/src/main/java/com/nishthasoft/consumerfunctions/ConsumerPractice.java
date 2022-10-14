package com.nishthasoft.consumerfunctions;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerPractice {

    public static void main(String[] args) {
        List<Integer> list = List.of(34,67,8,23,67,89,90);
        List<String> listOfString = List.of("hello","HI");

        Consumer<Integer> consumerInteger = e -> System.out.println(e);

        Consumer<String> stringConsumer = e -> System.out.println(e);



        consumerInteger.accept(56);

        printElement(list, consumerInteger);
        printElement(listOfString,stringConsumer);
    }

    private static <T> void printElement(List<T> list, Consumer<T> consumer) {

        for(T lst: list){
            consumer.accept(lst);
        }
    }
}
