package com.nishthasoft.stream;

import com.nishthasoft.beforejava8.Employee;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        long startTime;
        long endTime;


        for(int i = 0;i<100 ; i++){
            list.add(new Employee("John" ,20000));
            list.add(new Employee("Rohan" ,3000));
            list.add(new Employee("Tom" ,15000));
            list.add(new Employee("Bheem" ,8000));
            list.add(new Employee("Shiva" ,200));
            list.add(new Employee("Krishna" ,50000));
        }

        startTime = System.currentTimeMillis();
        System.out.println("Permorming sequentially " +list.stream()
                .filter(emp -> emp.getSalary() > 1000)
                .count());
        endTime = System.currentTimeMillis();

        System.out.println("Time take with sequential stream " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        System.out.println("Permorming parallel " +list.stream().parallel()
                .filter(emp -> emp.getSalary() > 1000)
                .count());
        endTime = System.currentTimeMillis();

        System.out.println("Time take with parallel stream " + (endTime - startTime));




    }
}
