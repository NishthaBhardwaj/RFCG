package com.nishthasoft.genericfunctions;

public class FunctionalGenericDemo {

    public static void main(String[] args) {
        FunctionalGenerics<String,Integer> lenghtOfString = s -> s.length();
        int x = lenghtOfString.execute("helooo");
        System.out.println(x);

        FunctionalGenerics<String,String> functionalGenerics = s -> s.substring(1,3);
        String s = functionalGenerics.execute("helooooooo");
        System.out.println(s);
    }
}
