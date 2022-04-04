package com.nishthasoft.arrays;

public class MultiDimentionArray {

    public static void main(String[] args) {
        int[][] y = new int[3][]; //array of arrays[3] base size

        y[0] = new int[2];
        y[1] = new int[5];
        y[2] = new int[6];

        int[][][] z = new int[2][][];
        z[0] = new int[3][];
        z[1] = new int[2][];
        z[0][0] = new int[1];
        z[0][1] = new int[2];
        z[0][2] = new int[3];

        z[1][0] = new int[1];
        z[1][1] = new int[2];
        z[1][2] = new int[3];
        z[0][0][0] = 20;

    }
}
