package com.nishthasoft.lamdaPractice;

public class LambdaPractice2 {

    public static void main(String[] args) {
        MathOperation mathOperation = (x,y) -> System.out.println(x + y);
        mathOperation.operation(4,5);
        MathOperation mathOperation1 = (x,y) -> System.out.println(x * y);
        mathOperation1.operation(4,7);
        twoParamOperation((z,c) -> System.out.println(z - 4),56,8);


    }

    static void twoParamOperation(MathOperation mathOperation, int x, int y){
        mathOperation.operation(x,y);

    }
}
