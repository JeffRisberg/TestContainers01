package com.company;

import com.company.models.Item;
import com.company.stores.ItemStore;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {

  static ItemStore itemStore;

  @BeforeClass
  public static void setup() {
    itemStore = new ItemStore();
  }

  @Test
  public void testList() {
    List<Item> names = itemStore.readAllItems();

    assertTrue(names.size() == 4);
  }

  @Test
  public void testUser() {
    String name = "Furby";
    String description = "Swift";

    Item user = new Item(2L, name, description, 44);

    assertEquals(name, user.getName());
  }
}
