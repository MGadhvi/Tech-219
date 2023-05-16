package com.sparta.mg.functional_programming;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("John", "Paul", "George", "Ringo"));
        names.stream()
                .filter(App::test)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static boolean test(String name) {
        return name.contains("o");
    }
}
