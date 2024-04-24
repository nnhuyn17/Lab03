package com.example.customadapter;

import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

public class User {

    //declare private data instead of public to ensure the privacy of data field of each class
    private String name;
    private String hometown;

    public User(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    //retrieve user's name
    public String getName() {
        return name;
    }

    //retrieve users' hometown
    public String getHometown() {
        return hometown;
    }

    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("Nathan", "San Diego"));
        users.add(new User("John", "Los Angeles"));
        users.add(new User("Emily", "New York"));
        users.add(new User("Daniel", "Chicago"));
        users.add(new User("Sophia", "Houston"));
        users.add(new User("Michael", "San Francisco"));
        users.add(new User("Emma", "Boston"));
        users.add(new User("William", "Seattle"));
        users.add(new User("Olivia", "Denver"));
        users.add(new User("James", "Portland"));
        users.add(new User("Ava", "Miami"));
        users.add(new User("Benjamin", "Dallas"));
        users.add(new User("Isabella", "Phoenix"));
        users.add(new User("Mason", "Austin"));
        users.add(new User("Charlotte", "Las Vegas"));
        return users;
    }
    

}