package com.sparta.mg.design_patterns.factory;

public class App {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.speak();
    }
}
