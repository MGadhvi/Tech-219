package com.sparta.mg.nested_classes.example;

import java.util.Comparator;

public class Spartan {
    public class SpartanComparator implements Comparator<Spartan> {
        @Override
        public int compare(Spartan o1, Spartan o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
    private String name;
    private int id;

    public Spartan(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
