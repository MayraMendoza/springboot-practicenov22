package com.mayram.springbootpracticenov22.controller;

import com.mayram.springbootpracticenov22.model.User;
import com.mayram.springbootpracticenov22.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping("users")
    public List<User> getuser(){

        return this.userRepository.findAll();

    }
}
