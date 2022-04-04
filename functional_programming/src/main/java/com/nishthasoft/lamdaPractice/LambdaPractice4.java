package com.nishthasoft.lamdaPractice;

public class LambdaPractice4 {

    public static void main(String[] args) {

        LenthOfString lenthOfString = s -> {

            int lenght = s.length();
            System.out.println(lenght);
            return lenght;
        };
        lenthOfString.length("Nishtha");



    }


}
