package com.nishthasoft.collectors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CollectorsInAction {

    public static void main(String[] args){
        Path path = Paths.get("/Volumes/My Files/nishtha-learnings/RFCG/EmployeeData.rtf");
        try(Stream<String> lines = Files.lines(path)){
            Stream<String> word = lines.flatMap(line -> Arrays.stream(line.split(",")));
            Spliterator<String> wordSpliterator = word.spliterator();
            Spliterator<Employee> employeeSpliterator = new EmployeeSpliterator(wordSpliterator);

            Stream<Employee> employees = StreamSupport.stream(employeeSpliterator, false);
            List<Employee> employeeList = employees.collect(Collectors.toList());

            List<String> name = employeeList.stream().map(emp -> emp.getName())
                    .collect(Collectors.toList());

            name.forEach(System.out::println);
            System.out.println("------X-----LIST-------X--------");


            Set<String> employeeDesgination = employeeList.stream().map(emp -> emp.getDesignation())
                    .collect(Collectors.toSet());

            employeeDesgination.forEach(System.out::println);
            System.out.println("------X-----SET-------X--------");

            TreeSet<Employee> employeeSorted = employeeList.stream()
                    .collect(Collectors.toCollection(() -> new TreeSet<Employee>()));

            employeeSorted.forEach(System.out::println);
            System.out.println("------X-----Collection(TreeSet)-------X--------");

            Map<Integer, String> getNameById = employeeList.stream()
                    .collect(Collectors.toMap(e -> e.getId(), e -> e.getName()));

            System.out.println(getNameById);
            System.out.println("------X-----Collection(Map)-------X--------");

            Map<Boolean, List<Employee>> partitionedByGender = employeeList.stream()
                    .collect(Collectors.partitioningBy(e -> e.getGender() == 'M'));

           // System.out.println(partitionedByGender);

            List<Employee> maleEmployees = partitionedByGender.get(true);
            List<Employee> femaleEmployees = partitionedByGender.get(false);

            System.out.println(maleEmployees);
            System.out.println(femaleEmployees);

            Map<String, List<Employee>> designationWiseGrouping = employeeList.stream()
                    .collect(Collectors.groupingBy(e -> e.getDesignation()));

            System.out.println(designationWiseGrouping);
            List<Employee> developer = designationWiseGrouping.get("Developer");
            List<Employee> Architect = designationWiseGrouping.get("Architect");
            List<Employee> Manager = designationWiseGrouping.get("Manager");
            List<Employee> Lead = designationWiseGrouping.get("Lead");

            System.out.println("-----Developer--------");
            System.out.println(developer);
            System.out.println("-----Architect--------");
            System.out.println(Architect);
            System.out.println("-----Manager--------");
            System.out.println(Manager);
            System.out.println("-----Lead--------");
            System.out.println(Lead);

            System.out.println("------X-----Collection(Map)-------X--------");

            Long totalSalary = employeeList.stream()
                    .map(e -> e.getSalary())
                    .collect(Collectors.counting());

            System.out.println(totalSalary);

            String empNameCommaSeparated = employeeList.stream()
                    .map(e -> e.getName())
                    .collect(Collectors.joining(","));

            System.out.println(empNameCommaSeparated);


        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
