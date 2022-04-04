package com.nishthasoft;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class ClassDemo{

    public void getData(){
        System.out.println("ffffff");
    }

}


public class GettingClassObject {


    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //forName()
        Class<?> aClass = Class.forName("java.lang.String");

        //ClassName.class

        Class<?> integerClass = int.class;
        Class<?> stringClass = String.class;

        // obj.getClass()
        ClassDemo classDemo = new ClassDemo();
        Class<? extends ClassDemo> classDemo2 = classDemo.getClass();
        System.out.println(classDemo2.getName());
        Class<ClassDemo> classDemoClass = ClassDemo.class;
        Class<ClassDemo> classDemoClass1 = ClassDemo.class;
        Constructor<?>[] declaredConstructors = classDemoClass.getDeclaredConstructors();
        ClassDemo o = (ClassDemo)declaredConstructors[0].newInstance();
        o.getData();
        System.out.println(classDemoClass == classDemoClass1);






    }
}
