package com.nishthasoft.collectors;

import java.sql.Date;
import java.util.Spliterator;
import java.util.function.Consumer;

public class EmployeeSpliterator implements Spliterator<Employee> {

    private int id;
    private String name;
    private char gender;
    private Date dob;
    private String city;
    private String designation;
    private Date joiningDate;
    private double salary;

    private Spliterator<String> wordSpliterator;
    public EmployeeSpliterator(Spliterator<String> wordSpliterator) {
        this.wordSpliterator = wordSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Employee> action) {

        if(this.wordSpliterator.tryAdvance(word -> this.id = Integer.parseInt(word))&&
         this.wordSpliterator.tryAdvance(word -> this.name = word)
                && this.wordSpliterator.tryAdvance(word -> this.gender = word.charAt(0))
                && this.wordSpliterator.tryAdvance(word -> this.dob = Date.valueOf(word))
                && this.wordSpliterator.tryAdvance(word -> this.city = word)
                && this.wordSpliterator.tryAdvance(word -> this.designation = word)
                && this.wordSpliterator.tryAdvance(word -> this.joiningDate = Date.valueOf(word))
                && this.wordSpliterator.tryAdvance(word -> this.salary = Double.valueOf(salary)))
         {
            action.accept(new Employee(this.id,
                    this.name,
                    this.gender,
                    this.dob,
                    this.city,
                    this.designation,
                    this.joiningDate,
                    this.salary));
            return true;
        }

        return false;
    }

    @Override
    public Spliterator<Employee> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return this.wordSpliterator.estimateSize()/8;
    }

    @Override
    public int characteristics() {
        return this.wordSpliterator.characteristics();
    }
}
