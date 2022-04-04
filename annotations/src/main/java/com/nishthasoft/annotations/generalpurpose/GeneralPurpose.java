package com.nishthasoft.annotations.generalpurpose;

import java.util.ArrayList;

class Parent {
    public void m1(){
        System.out.println("m1 Parent Implementation");
    }

    public void m2(){
        System.out.println("m2 Parent Implementation");
    }
}
public class GeneralPurpose extends Parent{

    @Override
    public void m1() {
        System.out.println("m2 Chile Implementation");
    }
    @Override
    public void m2() {
        System.out.println("m2 Chile Implementation");
    }

    public static void main(String[] args) {
        @SuppressWarnings("unsued")
        int a = 10;
        @SuppressWarnings({"rawtypes","unused"})
        ArrayList arrayList = new ArrayList();
        @Deprecated
        Integer integer = new Integer(0);

    }
}
