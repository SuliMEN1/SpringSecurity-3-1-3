package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserDetailsServiceImpl;

@RestController
public class LoginRestController {
//    private final AuthenticationManager authenticationManager;
//
//
//    public LoginRestController(AuthenticationManager authenticationManager) {
//        this.authenticationManager = authenticationManager;
//    }
}
