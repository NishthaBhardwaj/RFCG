package com.nishthasoft.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStreams {

    public static void main(String[] args) {


        //1 stream on collection
        List<Integer> integerList = List.of(2,3,4,5);
        Stream<Integer> stream = integerList.stream();

        // how we can stream a Map
        Map<Integer, String>  map = Map.of(1,"Nishtha",2,"java");
        Stream<Map.Entry<Integer, String>> entryStream = map.entrySet().stream();

        Stream<String> values = map.values().stream();
        Stream<Integer> keys = map.keySet().stream();

        //2. of() on Stream class
        Stream<String> stringStream = Stream.of("hey","Happy");

        //3. stream() on Arrays utilty class
        Integer[] integersArray = {3,4,5,6};
        Stream<Integer> stream1 = Arrays.stream(integersArray);
        int[] ints = {3,4,5};
        IntStream stream2 = Arrays.stream(ints);

        //4. builder() of Stream class

        Stream.Builder<Integer> builder = Stream.builder();
        builder.add(1);
        // code
        //conditions

        builder.add(4);
        Stream<Integer> build = builder.build();


    }
}
