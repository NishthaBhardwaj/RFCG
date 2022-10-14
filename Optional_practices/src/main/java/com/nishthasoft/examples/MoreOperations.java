package com.nishthasoft.examples;

import java.util.Optional;

public class MoreOperations {

    public static void main(String[] args) {

        //ifPresent

        Optional<String> optional = Optional.of("Value");

        // so basically ifpresent execute a consumer on the value present in the optional
        optional.ifPresent(val -> System.out.println("This is the value" + val));

        // but suppose we want to execute something even is optional is empty
        // for that we have method ifPresentorEls

        optional.ifPresentOrElse((val) -> System.out.println(val), () -> System.out.println("Value is absent"));
        Optional.empty().ifPresentOrElse((val) -> System.out.println(val), () -> System.out.println("Value is absent"));

        //next method is stream on an Optional. So if the value is present it returns the sequentail stream containing
        // only value otherwise it returns empty stream

        optional.stream().forEach(System.out :: println);
        Optional.empty().stream().forEach(System.out :: println);

        //or it takse the supplier and it returns the same optional if the optiaonl has the value and
        // if optional is empty then it supplies new optional by the supplier function

        // so supplier will get executed only when it this optional does not have value
        Optional<String> new_value = optional.or(() -> Optional.of("New Value"));
        Optional.empty().or(() ->Optional.of("New values")).ifPresent((val) -> System.out.println(val));
        //Optional.empty().or(() ->null).ifPresent((val) -> System.out.println(val)); // it will geive nullpointer

        //equals

        //optional
        //either both are empty
        // or if the values in optionals are equals to each other via equals methods

        System.out.println(optional.equals(Optional.of("Value")));

        //hashcode

        System.out.println(optional.hashCode());
        System.out.println(Optional.empty().hashCode());



    }
}
