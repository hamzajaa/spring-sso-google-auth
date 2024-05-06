package com.example.google.auth.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController {

    @GetMapping
    public String welcome() {
        return "Welcome to Google Auth !!";
    }

    @GetMapping("/user")
    public Principal welcome(Principal principal) {
        System.out.println("username: " + principal.getName());
        return principal;
    }
}
