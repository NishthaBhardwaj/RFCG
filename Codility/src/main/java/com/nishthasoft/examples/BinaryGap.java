package com.nishthasoft.examples;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryGap {
    
    public int solution(int N){
        String bString = Integer.toString(N,2);
        System.out.println(bString);

        int counter = 0;
        List<Integer> gap = new ArrayList<>();
        for(int i=0;i<bString.length();i++){
            String c = bString.substring(i,i + 1);
           // System.out.println(c);

            if(c.equals("1")){
                if(counter>0) {
                    gap.add(counter);
                }
            }
            if(c.equals( "0")){
                //System.out.println(c);
                counter = counter + 1;
            }
        }
        //System.out.println(gap);

        return gap.isEmpty()? 0:Collections.max(gap);
    }

    public static void main(String[] args) {
        BinaryGap binaryGap = new BinaryGap();

        int result = binaryGap.solution(19);
        System.out.println(result);
    }
}
