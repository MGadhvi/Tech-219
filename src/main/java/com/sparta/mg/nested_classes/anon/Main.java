package com.sparta.mg.nested_classes.anon;

public class Main {
    public static void main(String[] args) {
        Speakable bird = new Speakable() {
            @Override
            public void speak(String name) {

            }

            @Override
            public void play() {

            }
        };
    }
}
