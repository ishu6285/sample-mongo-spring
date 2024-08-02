package org.example.demomongoapplication.controller;

import org.example.demomongoapplication.dto.request.UserRegApiRequest;
import org.example.demomongoapplication.dto.response.UserRegApiResponse;
import org.example.demomongoapplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RequestMapping("/api/v1/user")
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/register")
    public UserRegApiResponse register(@RequestBody UserRegApiRequest request){
        return userService.save(request);

    }

}
