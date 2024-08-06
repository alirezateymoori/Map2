package com.demisco;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Map<Student, Double> map = new HashMap<Student, Double>();
        map.put(new Student("Ali Alavi"), (18.76));
        map.put(new Student("Taghi Taghavi"), (15.43));
        map.put(new Student("Naghi Naghavi"), (17.26));
        map.put(new Student("Naghi Naghavi"), (15.26));
        map.remove(new Student("Naghi Naghavi"));
        Double grade = map.get(new Student("Taghi Taghavi"));
        System.out.println("Grade of Taghi=" + grade);
        for (Student student : map.keySet())
            System.out.println(student.toString());
        Double totalSum = 0.0;
        for (Double avg : map.values())
            totalSum += avg;
        System.out.println("Average = " + (totalSum / map.size()));
    }
}