package com.nishthasoft;

import com.nishthasoft.dto.Entity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInfo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Entity e = new Entity(10,"id");
        Class<?> clazz = e.getClass();
        Method[] methods = clazz.getMethods(); //only public methods for entity and its super class
        for (Method method: methods){
            System.out.println(method.getName());
        }
        System.out.println("-------------");
        Method[] declaredMethods = clazz.getDeclaredMethods(); // all the methods of only Entity class public and privates
        for (Method method: declaredMethods){
            System.out.println(method.getName());
        }
        Method method = clazz.getMethod("setVal", int.class);
        method.invoke(e,300);
        System.out.println(e.getVal());

        Method m = clazz.getDeclaredMethod("getInt");
        m.setAccessible(true);
        int invoke = (int)m.invoke(e);
        System.out.println(invoke);


    }
}
