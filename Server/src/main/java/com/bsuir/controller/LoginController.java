package com.bsuir.controller;

import com.bsuir.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class LoginController {
    @Autowired
    UserRepository repository;

    @GetMapping("login")
    public String login(@RequestBody String data){
        System.out.println(data);
        return data;
    }


}
