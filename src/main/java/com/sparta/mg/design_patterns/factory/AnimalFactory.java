package com.sparta.mg.design_patterns.factory;

public class AnimalFactory {

    public static Animal getAnimal(String animalName) {
        switch (animalName) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            case "cow":
                return new Cow();
        }
        return null;
    }

}
