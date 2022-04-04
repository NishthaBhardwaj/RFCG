package com.nishthasoft;

import com.nishthasoft.dto.Entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class FieldInfo {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Entity e = new Entity(4,"AA");
        Class<?> clazz = e.getClass();
        Field[] fields = clazz.getFields();
        for (Field f: fields){
            System.out.println(f.getName());
        }
        // non-declared: all the public fields in that class and in its super class
        // declared: all the fields present in that class only.

        Field[] deFields = clazz.getDeclaredFields();
        for(Field field: deFields){
            System.out.println(field.getName());
        }

        Field val = clazz.getField("type");
        Field type = clazz.getDeclaredField("val");
        type.setAccessible(true);
        val.set(e,"BB");
        type.set(e,20);
        System.out.println(e.getType());
        System.out.println(e.getVal());


    }
}
