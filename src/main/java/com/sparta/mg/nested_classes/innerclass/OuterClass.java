package com.sparta.mg.nested_classes.innerclass;

public class OuterClass {

    private String privateString = "private String";

        private class InnerClass {
        public String print() {
            return "I can see the " + privateString;
        }
        OuterClass outerClass = new OuterClass();

    }

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
    }
}
