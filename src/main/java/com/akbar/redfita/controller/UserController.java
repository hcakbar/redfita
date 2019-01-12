package com.akbar.redfita.controller;

import com.akbar.redfita.domain.entity.UserEntity;
import com.akbar.redfita.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserEntity> getAllUsers() {
        return userService.findAll();
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public UserEntity findUserById(@PathVariable long id) {
        return userService.findById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String createUser(@RequestBody UserEntity entity) {
        userService.addUser(entity);
        return "User added successfully!";
    }

}
