package com.company;

import com.company.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    protected List<User> users;

    public Main() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public static void main(String[] args) {
        logger.debug("Welcome to Example 1");

        Main main = new Main();

        User user1 = new User(1l, "Jack", "Jones");
        main.addUser(user1);

        User user2 = new User(1l, "John", "Smith");
        main.addUser(user2);

        User user3 = new User(1l, "Helen", "Underhill");
        main.addUser(user3);

        for (User user : main.getUsers()) {
            System.out.println(user);
        }
    }
}
