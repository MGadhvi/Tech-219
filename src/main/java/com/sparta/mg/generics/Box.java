package com.sparta.mg.generics;

public class Box {
    private Object object; //problem?

    public Box(Object object) {
        this.object = object;
    }

    public void set(Object object) { this.object = object; }
    public Object get() { return object; }

    public static void main(String[] args) {
        Box box = new Box(1);
        System.out.println(box.get());
    }
}
