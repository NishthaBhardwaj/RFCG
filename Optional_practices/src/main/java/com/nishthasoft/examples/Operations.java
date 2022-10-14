package com.nishthasoft.examples;

import java.util.Optional;

public class Operations {

    public static void main(String[] args) {

        Optional<String> optional = Optional.of("Value");
        Optional<String> emptyOptional = Optional.empty();

        //map()
        /*
        if the values is present it transform or map the value into another optional
        according to the given function
        So it transform the value and map() in wrap it itno another Optional and return it
         */
        Optional<String> map = optional.map((val) -> "Replaced");
        String returnVal = emptyOptional.map((val) -> "Replace").orElseGet(() -> "Empty");

        System.out.println(map.orElseGet(() -> "Empty"));
        System.out.println(returnVal);

        //filter()
        // if condition is matched then it will return the value

        Optional<String> optional1 = optional.filter(val -> val.equalsIgnoreCase("Values"));
        System.out.println(optional1.get());

        //flatMap()
        // flatMap is similar tp map but the mapping function is one who's result is always an Optional

        Optional<String> optional2 = optional.flatMap((val -> Optional.of("Replaced By flat map" )));


    }
}
