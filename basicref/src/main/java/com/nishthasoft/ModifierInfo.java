package com.nishthasoft;

import com.nishthasoft.dto.Entity;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ModifierInfo {
    public static void main(String[] args) throws NoSuchMethodException {
        Entity e = new Entity(10,"AA");
        Class<?> clazz = e.getClass();
        int modifiersInt = clazz.getModifiers();
        //int i = modifiersInt & Modifier.PUBLIC;
        boolean isPublicClass = Modifier.isPublic(modifiersInt);
        System.out.println(isPublicClass);
        System.out.println(Modifier.toString(modifiersInt));

        Method method = clazz.getMethod("getVal");
        int methodModifier = method.getModifiers();
        //int isPublic = methodModifier & Modifier.PRIVATE;
        boolean isPublic = Modifier.isPublic(methodModifier);

        System.out.println(isPublic);
    }
}
