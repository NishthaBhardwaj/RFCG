package com.nishthasoft;

import java.util.function.Supplier;

public class supplierfunction {
    public static void main(String[] args) {

        Supplier<String>  stringSupplier = () -> new String("A String");
        Supplier<Double> doubleSupplier = () -> Math.random();
        System.out.println(doubleSupplier.get());

        System.out.println(stringSupplier.get());
    }
}
