package com.company;

import com.company.models.User;

import java.util.ArrayList;
import java.util.List;

public class Main {

    protected List<User> users;

    public Main() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public static void main(String[] args) {
        Main main = new Main();

        User user1 = new User(1l, "Jack", "Jones");
        main.addUser(user1);

        for (User user : main.getUsers()) {
            System.out.println(user);
        }
    }
}
