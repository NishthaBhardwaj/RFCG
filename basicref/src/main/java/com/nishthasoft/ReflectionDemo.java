package com.nishthasoft;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class MyClass {
    private MyClass() {
        System.out.println("MyClass object is created");
    }
}


public class ReflectionDemo {



    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<?> aClass = Class.forName("com.nishthasoft.MyClass");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        MyClass myClass = (MyClass) declaredConstructor.newInstance();


    }
}
