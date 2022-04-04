
package com.nishthasoft;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException{
        Class<String> stringClass = String.class;
        Map<String,Integer> mapObject = new HashMap<>();

        Class<?> hashMapCalss = mapObject.getClass();
        Class<?> suqareClass = Class.forName("com.nishthasoft.Main$Square");
        Class<?> enumm = Class.forName("com.nishthasoft.Main$Color");

        Drawable drawable = new Drawable() {
            @Override
            public int getNumberOfConrers() {
                return 0;
            }
        };

        // printClassInfo(stringClass, hashMapCalss,suqareClass,enumm);
        printClassInfo(Collection.class, Boolean.class,int [][].class,Color.class,drawable.getClass());

    }

    private static void printClassInfo(Class<?>... classes){
        for(Class<?> clazz: classes) {
            System.out.println(String.format("class name : %s, class package name: %s",
                    clazz.getSimpleName(),
                    clazz.getPackageName()));

            Class<?>[] implementedIntefaces = clazz.getInterfaces();
            for (Class<?> clas: implementedIntefaces){
                System.out.println(String.format("class %s implements : %s",
                        clazz.getSimpleName(),
                        clas.getSimpleName()));
            }

            System.out.println("Is Arry " + clazz.isArray());
            System.out.println("is Premitive "+ clazz.isPrimitive());
            System.out.println("Is Interface " + clazz.isInterface());
            System.out.println("Is Enum " + clazz.isEnum());
            System.out.println("Is anonymous "+ clazz.isAnonymousClass());

            System.out.println();
            System.out.println();

        }

    }

    private static class Square implements Drawable{

        @Override
        public int getNumberOfConrers() {
            return 4;
        }
    }

    private static interface Drawable{
        int getNumberOfConrers();
    }

    private enum Color{
        BLUE,
        RED,
        GREEN


    }

}
