package com.nishthasoft.annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReadingAnnotation {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("com.nishthasoft.annotations.Utility");
        Constructor<?> constructor = clazz.getConstructor();
        Utility utility = (Utility) constructor.newInstance();

        Method [] methods = clazz.getDeclaredMethods();
        for(Method method: methods){
            if(method.isAnnotationPresent(MostUsed.class)){

               // method.invoke(utility,"helooo");
                MostUsed mostUsed = (MostUsed) method.getAnnotation(MostUsed.class);
                String value = mostUsed.value();
                method.invoke(utility,value);

            }

        }
    }
}
