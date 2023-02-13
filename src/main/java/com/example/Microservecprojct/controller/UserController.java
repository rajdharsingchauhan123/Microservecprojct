package com.example.Microservecprojct.controller;

import com.example.Microservecprojct.entity.User;

import com.example.Microservecprojct.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/users")
    public ResponseEntity<User>createUser(@RequestBody User user) {
        User user1 = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    // single id

  @GetMapping("/{userId}")
          public ResponseEntity<User>getSingleUser( String userId){
        User user =userService.getUser(userId);
        return ResponseEntity.ok(user);

        }



@GetMapping
        // all get user
    public ResponseEntity<List<User>>getAllUser(){
       List<User>allUser=userService.getAllUser();
        return ResponseEntity.ok(allUser);






    }
}
