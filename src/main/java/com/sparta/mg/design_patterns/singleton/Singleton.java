package com.sparta.mg.design_patterns.singleton;

public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton(){}

    public static Singleton getSingleton() {
        return singleton;
    }
}
