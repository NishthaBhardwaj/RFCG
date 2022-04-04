package com.nishthasoft.annotations;

public class Enhancement {
    public static void main(String[] args) {
        Box<String> box = new @NonEmpty @ReadOnly Box<>(10,"container");
        box.new @ReadOnly @NonEmpty NestedBox(11,"Cylinder");

    }
}
