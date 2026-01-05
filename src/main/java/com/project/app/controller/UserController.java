package com.project.app.controller;

import com.project.app.models.User;
import com.project.app.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/greetings")
    public String greetings(){
        return "Hello World";
    }

    @PostMapping
    public User create(@RequestBody User user) {
        System.out.println("User --->" + user);
        return userService.createUser(user);
    }

    @GetMapping
    public List<User> list() {
        return userService.getUsers();
    }
}
