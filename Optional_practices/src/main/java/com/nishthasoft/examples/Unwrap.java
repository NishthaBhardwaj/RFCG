package com.nishthasoft.examples;

import java.util.Optional;

public class Unwrap {
    public static void main(String[] args) {

        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);

        // let me warn you this unwrap never use this get. get method on an Optional it is a risky
        // so when you are not sure this Option has the value then do not use this method
        Integer integerVal = optional.get();

        Optional<Integer> emptyOptiona = Optional.empty();

       // emptyOptiona.get(); // will give NoSuchElementException

        Integer value = emptyOptiona.isPresent() ? emptyOptiona.get():0;
        System.out.println(value);

        // but we have far better alternatives for doing this
        //orElse orElseGet

        Integer orElse = optional.orElse(0);
        Integer orElseEmptyOptiona = emptyOptiona.orElse(0);
        System.out.println(orElse);
        System.out.println(orElseEmptyOptiona);

        // orElseGet also set the default value but it take a supplier
        /*
        So if we consider the performance these is one more difference b/w these orElse and orElseGet
        in case of orElse the default object always get generated however it gets return only if the
        Optiona is empty this may have performance over head.
        where as asElseGet is execute the supplier to get the default only in case Optional is Empty
        if it is not empty directly returns the present value without executing the supplier function
         */

        Integer supllierIntVal = optional.orElseGet(() -> 0);

        /*
        IF IN EMPTY CASE YOU DO NOT WANT A RETURN VALUE YOU STILL WANT A SPECIF EXCEPTION.
        FOR THE WE HAVE orElseThrow
         */

        Integer integer = emptyOptiona.orElseThrow(() -> new IllegalArgumentException());

        // orElseThrow() got added in java 10 == get()


    }
}
