package com.company;

import com.company.models.Item;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {

  @Test
  public void testList() {
    List<String> names = new ArrayList<>();

    names.add("Jack");
    assertTrue(names.size() == 1);
  }

  @Test
  public void testUser() {
    String name = "Tom";
    String description = "Swift";

    Item user = new Item(2L, name, description, 44);

    assertEquals(name, user.getName());
  }
}
