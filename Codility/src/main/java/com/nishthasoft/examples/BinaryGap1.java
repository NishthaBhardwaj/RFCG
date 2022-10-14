package com.nishthasoft.examples;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap1 {

    public int solution(int N){
        String bString = Integer.toString(N,2);

        boolean started = false;
        int counter = 0;
        int maxCounter = 0;

        for(int i=0;i<bString.length();i++){
            String c = bString.substring(i,i + 1);

            if(c.equals("1")){
                if(started) {
                    if(counter > maxCounter){
                        maxCounter = counter;
                    }
                }
                counter = 0;
                started = true;
            }
            if(c.equals( "0")){
                counter++;
            }
        }

        return maxCounter;
    }

    public static void main(String[] args) {
        BinaryGap1 binaryGap = new BinaryGap1();

        int result = binaryGap.solution(1765);
        System.out.println(result);
    }
}
