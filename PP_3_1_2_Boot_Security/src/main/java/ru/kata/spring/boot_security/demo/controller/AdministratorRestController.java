package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserDetailsServiceImpl;

import java.util.List;

//@RestController
//@RequestMapping("/admin")
//public class AdministratorRestController {
//    private final UserDetailsServiceImpl userDetailsService;
//
//    private final RoleService roleService;
//
//    public AdministratorRestController(UserDetailsServiceImpl userDetailsService, RoleService roleService) {
//        this.userDetailsService = userDetailsService;
//        this.roleService = roleService;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<User>> apiGetAllUsers() {
//        List<User> users = userDetailsService.listUser();
//        UserDetails userDetails = userDetailsService.loadUserByUsername(userDetailsService.getCurrentUsername());
//        MultiValueMap<String, String> mvm = new LinkedMultiValueMap<>();
//        mvm.add("emailAuntification", userDetails.getUsername());
//        mvm.add("roleAuntification", String.valueOf(userDetails.getAuthorities()));
//        return new ResponseEntity<>(users, mvm, HttpStatus.OK);
//    }
//
//    @PostMapping
//    public ResponseEntity<HttpStatus> apiAddNewUser(@RequestBody User user) {
//        userDetailsService.add(user);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//   @PutMapping("/{id}")
//    public ResponseEntity<HttpStatus> apiUpdateUser(@PathVariable Long id, @RequestBody User user) {
//        user.setId(id);
//        userDetailsService.update(user);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<HttpStatus> apiDeleteUser(@PathVariable Long id) {
//        userDetailsService.delete(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//}
