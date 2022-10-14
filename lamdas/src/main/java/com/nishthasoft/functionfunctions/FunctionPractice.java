package com.nishthasoft.functionfunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionPractice {

    public static void main(String[] args) {

        List<String> stringList = List.of("kit","kat","shake");

        Function<Integer,String> stringFunction = (intData) -> String.valueOf(intData);

        Function<String, Integer> integerFunction = (strData) -> strData.length();

        System.out.println(integerFunction.apply("hello how are you"));

        System.out.println(stringFunction.apply(456789));

        List<Integer> integerList = map(stringList,integerFunction);
        System.out.println(integerList);
    }

    private static <T,R> List<R> map(List<T> stringList, Function<T, R> integerFunction) {
        List<R> integerList = new ArrayList<>();
        for(T str: stringList){
            R lencth = integerFunction.apply(str);
            integerList.add(lencth);

        }
        return integerList;
    }

}
