package com.sparta.mg.exceptions;

public class App {
    private static int getValueFromArray(int[] array, int position) {
        return array[position];
    }

    private static void printValueFromArray(int[] array, int position) {
        System.out.println("Value at position " + position + " is " + getValueFromArray(array,position));
    }

    public static void main(String[] args) {
        try {
            printValueFromArray(new int[]{1, 2, 3, 4}, 10);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
