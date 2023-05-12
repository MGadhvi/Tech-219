package com.sparta.mg.design_patterns.decorator.sides;


public abstract class Sides extends Pizza {
    protected Pizza pizza;

    public Sides(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract String getDescription();
}
