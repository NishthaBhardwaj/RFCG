package com.nishthasoft.annotations;

@MostUsed
public class Utility {
    void doStuff(){
        System.out.println("doing something");
    }

    @MostUsed("Python")
    void doStuff(String arg){
        System.out.println("operating on" + arg);
    }

    void doStuff(int i){
        System.out.println("operating on" + i);
    }
}

class SubUtility extends Utility{

}
