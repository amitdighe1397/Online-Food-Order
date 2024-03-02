package com.example.service;

import java.util.List;

import com.example.payloads.UserPayload;

public interface UserService {
    List<UserPayload> getAllUsers();
    UserPayload getUserById(int userId);
    UserPayload createUser(UserPayload userPayload);
    void deleteUser(int userId);
}
