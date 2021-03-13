package com.bsuir.controller;

import com.bsuir.entity.User;
import com.bsuir.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping("/users")
    @ResponseBody
    List<User> all() {
        return repository.findAll();
    }
    @GetMapping("/users/{id}")
    @ResponseBody
    User getUser(@PathVariable Long id){
        return repository.findById(id).get();
    }

}
