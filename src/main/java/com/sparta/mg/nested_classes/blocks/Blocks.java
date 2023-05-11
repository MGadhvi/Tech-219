package com.sparta.mg.nested_classes.blocks;

public class Blocks {
    static {
        System.out.println("Inside static block");
    }

    {
        System.out.println("Inside block");
    }

    public static void main(String[] args) {
        Blocks blocks = new Blocks();
        Blocks blocks1 = new Blocks();
        System.out.println("Inside main method");
    }
}
