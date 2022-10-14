package com.nishthasoft.recursive;

public class Practice {

    public static void main(String[] args) {

        myLoop(20,1);

    }

    static void myLoop(int nummber, int start){

        if(nummber == 0){
            return;
        }

        myLoop(nummber-1, nummber -1);
        System.out.println(nummber - 1);
    }
}
