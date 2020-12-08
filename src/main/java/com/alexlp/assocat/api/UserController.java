package com.alexlp.assocat.api;

import com.alexlp.assocat.model.User;
import com.alexlp.assocat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;

@RequestMapping("api/v1/user")
@RestController
public class UserController {

    private  final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    //TODO implements post, get etc... request

    @GetMapping
    Optional<User> getCustomerById(){
        return userService.getUserById(UUID.fromString("45214688-3639-11eb-923b-0242ac130002"));
    }
}
