package com.nishthasoft;

import com.nishthasoft.dto.Entity;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorInfo {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Entity e = new Entity(40,"con");
        Class<?> clazz1 = e.getClass();
        Class<?> clazz = Class.forName("com.nishthasoft.dto.Entity");
        Constructor<?>[] constructors1 = clazz.getConstructors();
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor: constructors){
            System.out.println(constructor);

        }

        Constructor<?> constructor = clazz.getConstructor(int.class,String.class);
        Entity entity = (Entity) constructor.newInstance(10,"maaa");
        System.out.println(entity.getVal());

        Constructor<?>privateCon = clazz.getDeclaredConstructor();
        privateCon.setAccessible(true);
        Entity entity1 = (Entity) privateCon.newInstance();
        System.out.println(entity1.getType() + " " + entity1.getVal());
    }
}
