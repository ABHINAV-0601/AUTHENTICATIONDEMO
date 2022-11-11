package com.example.AUTHENTICATIONDEMO.service;

import com.example.AUTHENTICATIONDEMO.domain.User;
import com.example.AUTHENTICATIONDEMO.exception.UserNotFoundException;

import java.util.List;

public interface UserService {
    public User addUser(User user);
    public User findByUsernameAndPassword(String username , String password) throws UserNotFoundException;
    List<User> getAllUsers();
}
