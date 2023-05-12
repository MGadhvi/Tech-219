package com.sparta.mg.employees_project;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        try {
            String[] employees = EmployeeFactory.getEmployees(1000);

            Arrays.stream(employees)
                    .filter(s -> (s.contains("Name")))
                    .forEach(System.out::println);
            //System.out.println(Arrays.toString(employees));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
