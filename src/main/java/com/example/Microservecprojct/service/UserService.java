package com.example.Microservecprojct.service;

import com.example.Microservecprojct.entity.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    List<User>getAllUser();

    User getUser(String userId);
}
