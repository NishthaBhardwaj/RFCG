package com.nishthasoft.lamdaPractice;

public class LambdaPractice3 {

    public static void main(String[] args) {

        LenthOfString lenthOfString = (s) -> s.length();

        int lenth = lenthOfString.length("Hi My Name is Nishtha");
        System.out.println(lenth);

    }


}
