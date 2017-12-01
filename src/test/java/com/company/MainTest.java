package com.company;

import com.company.models.User;
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
    public void testUser() {
        String firstName = "Tom";
        String lastName = "Smith";

        User user = new User(2L, firstName, lastName);

        assertEquals(firstName, user.getFirstName());
    }

    @Test
    public void testMain() {
        Main main = new Main();

        User user1 = new User(2L, "Tom", "Smith");
        User user2 = new User(3L, "Jack", "Underhill");

        main.addUser(user1);
        main.addUser(user2);

        List<User> users = main.getUsers();

        assertTrue(users.size() == 2);
    }

}
