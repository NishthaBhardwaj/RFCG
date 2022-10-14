package com.nishthasoft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

// extends the functionality of function and take the same and return the same type
public class UnaryOpPractice {

    public static void main(String[] args) {

        List<Integer> integerList = List.of(12,34,50,34);
        UnaryOperator<Integer> unaryOperator = (intValue) -> intValue *2;

        System.out.println(unaryOperator.apply(20));

        List<Integer> integerList1 = mapper(integerList,unaryOperator);
        System.out.println(integerList1);
    }

    private static <T> List<T> mapper(List<T> integerList, UnaryOperator<T> unaryOperator) {
        List<T> list = new ArrayList<>();
        for (T ele: integerList){
            list.add(unaryOperator.apply(ele));
        }
        return list;
    }
}
