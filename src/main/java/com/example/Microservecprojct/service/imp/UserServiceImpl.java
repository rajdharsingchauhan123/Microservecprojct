package com.example.Microservecprojct.service.imp;

import com.example.Microservecprojct.entity.User;
import com.example.Microservecprojct.exception.ResourceNotFoundEx;
import com.example.Microservecprojct.repository.UserRepository;
import com.example.Microservecprojct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepository userRepository;
    @Override
    public User saveUser(User user) {
    // generate unique id
        String randomUserId=UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundEx("user is not found the givven id"+userId));
    }
}
