package com.naveen.testapp.controller;

import com.naveen.testapp.model.User;
import com.naveen.testapp.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AuthController {

    @Autowired
    private AuthService authService;

    @GetMapping(value = "/login")
    public String Login() {
        return "Login";
    }

    // Login Post request
    @PostMapping(value = "/login")
    public User loginRequest(@RequestBody User user) {
        return user;
    }

    @GetMapping(value = "/register")
    public String Register() {
        return "register";
    }

    //Register post request
    @PostMapping(value = "/register")
    public User registerRequest(@RequestBody User user) {
       return authService.register(user);
    }

    // Get all the users from the database
    @GetMapping(value = "/users")
    public List<User> getUsers() {
        return authService.getUsers();
    }


}
