package com.sparta.mg.nested_classes.local_class;

public class OuterClass {

    private String privateString = "private String";
    private static String privateStaticString = "private Static String";

    public void greetSpartan() {
        class Spartan {
            private String name;

            public Spartan(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public void isVisible() {
                System.out.println(privateString);
                System.out.println(privateStaticString);
            }
        }

        Spartan spartan = new Spartan("Manish");
        System.out.println(spartan.getName());
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.greetSpartan();
    }
}
