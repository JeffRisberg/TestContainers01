package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    protected List<String> names;

    public Main() {
        this.names = new ArrayList<>();
    }

    public void addName(String name) {
        names.add(name);
    }

    public List<String> getNames() {
        return names;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addName("Jack");
        main.addName("Jill");
        main.addName("Jeff");
        main.addName("Emily");

        for (String name : main.getNames()) {
            System.out.println(name);
        }
    }
}
