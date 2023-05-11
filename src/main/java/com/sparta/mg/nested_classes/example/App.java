package com.sparta.mg.nested_classes.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10,2,7,4,15));
        ArrayList<Spartan> spartans = new ArrayList<>(Arrays.asList(
                new Spartan("Manish", 1),
                new Spartan("Gary", 2),
                new Spartan("David",3)));

        Collections.sort(numbers);
        //Collections.sort(spartans, new SpartanComparator());
    }
}
