package com.sparta.mg.generics;

import java.math.BigInteger;

public class GenericBox<T> {
    private T t;

    public GenericBox(T t) {
        this.t = t;
    }

    public void set(T t) { this.t = t; }
    public T get() { return t; }

    public static void main(String[] args) {

    }
}
