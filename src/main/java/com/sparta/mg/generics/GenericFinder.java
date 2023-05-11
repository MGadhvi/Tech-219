package com.sparta.mg.generics;

import java.time.LocalDate;

public class GenericFinder {
    public static <T> boolean findInArray(T[] arrayToCheck, T objectToFind) {
        boolean answer = false;
        for (T object : arrayToCheck) {
            if (objectToFind.equals(object)) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"A", "E", "I", "O", "U"};
        Integer[] numbers = {1,2,3,4,5};
        LocalDate[] dates = {LocalDate.now(), LocalDate.of(2021,8,13), LocalDate.of(200,1,1)};

        System.out.println(GenericFinder.findInArray(words, "A"));
        System.out.println(GenericFinder.findInArray(numbers, 1));
        System.out.println(GenericFinder.findInArray(dates, LocalDate.now()));
    }
}
