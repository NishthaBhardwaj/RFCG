package com.nishthasoft.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StatelessStatefulOp {

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);

        list.parallelStream()
                .skip(2)
                .limit(5)
                .collect(Collectors.toList());
    }
}
