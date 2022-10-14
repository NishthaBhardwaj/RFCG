package com.nishthasoft;

import java.util.function.Function;

public class ConstructorReference {

    public static void main(String[] args) {
        Function<Runnable, Thread> thredGenerator1 = r -> new Thread(r);

        Function<Runnable, Thread> thredGenerator = Thread :: new;

        Runnable runnable = () -> System.out.print("hellooo");
        thredGenerator.apply(runnable).start();

        thredGenerator.apply(() -> System.out.println("Task executing...")).start();
    }
}
