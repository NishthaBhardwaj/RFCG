package com.nishthasoft.examples;

import java.util.Optional;

// wrap the object or value in Optional object
/*
Optional is Box which wrap a value in it.  it consume 16 bytes. It is a separate object.
So do not think no new object will be created when we wrape a value in it. Optionals are
immutable. So that is clear that creating Optional object every where cost performance
because each time it creates a new object so don't replace null Optional where you really do not need it.
 */
public class OptionalCreation {

    public static void main(String[] args) {

        String val = " A String";

        Optional<String> optional = Optional.of(val);

        // empty
        Optional<Integer> empty = Optional.empty();

        // nullable
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);



    }
}
