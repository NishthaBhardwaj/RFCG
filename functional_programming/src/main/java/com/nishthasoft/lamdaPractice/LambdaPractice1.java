package com.nishthasoft.lamdaPractice;

public class LambdaPractice1{

    public static void main(String[] args) {

        Name name = ()-> System.out.println("Nishtha");
        name.myName();
    }



}

interface Name{
    void myName();
}

