package com.library.service;
import com.library.model.User;
import java.util.ArrayList;

public class UserService {

    private ArrayList<User> users = new ArrayList<>();

    public void registerUser(User user){
        for (User u: users){
            if (u.getEmail().equals(user.getEmail())){
                System.out.println("User with this email already exists.");
                return;
            }
        }
        users.add(user);
        System.out.println("User registered successfully.");
    }

    public User loginUser(String email, String password){
        for (User u: users){
            if (u.getEmail().equals(email) && u.getPassword().equals(password)){
                System.out.println("Login successful.");
                return u;
            }
        }
        System.out.println("Invalid email or password.");
        return null;
    }

    
}