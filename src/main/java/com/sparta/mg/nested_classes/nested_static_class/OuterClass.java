package com.sparta.mg.nested_classes.nested_static_class;

public class OuterClass {

    private String privateString = "private String";
    private static String privateStaticString = "private Static String";

    private static class InnerClass {
        OuterClass outerClass = new OuterClass();

        public OuterClass getOuterClass() {
            return outerClass;
        }

        public String print() {
            OuterClass outerClass = new OuterClass();
            return "I can see the " + outerClass.privateString;
            return "I can see the " + privateString; //not visible
        }

        public String printStatic() {
            return "I can see the " + privateStaticString;
        }
    }

    public static void main(String[] args) {
        InnerClass innerStaticClass = new OuterClass.InnerClass();
        System.out.println(innerStaticClass.print());
        System.out.println(innerStaticClass.getClass());
    }
}
