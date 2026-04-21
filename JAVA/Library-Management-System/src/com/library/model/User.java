package com.library.model;

public class User {
    private int id;
    private String name;
     private Role role;// "admin" or "user"

    public User(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Role getRole() {
        return role;
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Role: " + role);
    }
}