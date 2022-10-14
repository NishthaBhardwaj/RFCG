package com.nishthasoft.streamfromcustomesource;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class Characteristics {

    public static void main(String[] args) {
        List<Integer> list = List.of(4,2,5,6,7,8);

        Stream<Integer> stream = list.stream();

        Spliterator<Integer> spliterator = stream.spliterator();
        int bits = spliterator.characteristics();
        System.out.println(Integer.bitCount(bits));

        // OR because this bit olready set then OR will not effect that already set
        System.out.println(Integer.bitCount(bits | 0x00000010));
        // AND
        System.out.println(bits & 0x00000010);

        boolean b = spliterator.hasCharacteristics(0x00000010);
        System.out.println(b);


    }
}
