package com.nishthasoft.arrays;

public class Introduction {

    public static void main(String[] args) {
        int[] x = new int[100];
        System.out.println(x.getClass().getName());
        int[] x1 = new int['a']; //byte,short,char and int the values that can be promoted to int we can take those value
        // as the size of array

        int[] x2 = new int[0];
       // int [] q = new int[-1]; // give java.lang.NegativeArraySizeException runtime exception
        int[] p = new int[2147483647]; // maximum size
        //2147483647 * 4 heap memoy we need to require to ceate this array

    }
}
