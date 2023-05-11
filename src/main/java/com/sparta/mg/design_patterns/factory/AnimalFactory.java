package com.sparta.mg.design_patterns.factory;

import com.sparta.mg.logging.App;

import java.util.logging.Logger;

public class AnimalFactory {
    public static final Logger logger = Logger.getLogger(App.class.getName());

    public static Animal getAnimal(String animalName) {
        logger.info("Method has been called");
        logger.info("Parameter passed" + animalName);
        for (int i = 0; i < 100; i++) {
            logger.fine("For loop started");
            logger.finer("Value of i: " + i);
            System.out.println(i);
        }
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
