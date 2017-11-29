package com.company;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MainTest extends TestCase {

    @Test
    public void testList() {
        List<String> names = new ArrayList<String>();

        names.add("Jack");
        assertTrue(names.size() == 1);
    }

    @Test
    public void testMain() {
        Main main = new Main();

        main.addName("Jack");
        main.addName("Jill");

        List<String> names = main.getNames();

        assertTrue(names.size() == 2);
    }
}
