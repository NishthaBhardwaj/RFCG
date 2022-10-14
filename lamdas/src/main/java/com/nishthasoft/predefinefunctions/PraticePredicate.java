package com.nishthasoft.predefinefunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PraticePredicate {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("nishthasoft");
        list.add("");
        list.add("Strong");
        list.add("");
        Predicate<String> predicate = s-> !s.isEmpty();

        List<String> list1 = filterList(list, s->s.contains("Nishtha"));
        System.out.println(list1);

        List<String> newList = filterList(list, predicate);
        System.out.println(newList);

        List<Integer> integerList = filterList(Arrays.asList(4,5,10,3),number -> number>5);
        System.out.println(integerList);



    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        for (T l: list){
            if(predicate.test(l)){
                newList.add(l);
            }
        }
        return newList;


    }
}
