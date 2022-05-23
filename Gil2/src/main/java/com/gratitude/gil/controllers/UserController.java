package com.gratitude.gil.controllers;

import com.gratitude.gil.model.User;
import com.gratitude.gil.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {


    public final UserService us;

    @GetMapping()
    public List<User> getAll(){
        return us.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return us.getUserById(id);
    }

    @PostMapping()
    public User createUser(@RequestBody User user){
        return us.createUser(user);
    }

    @PostMapping("/{id}")
    public User updateUser(@RequestBody User user){
        return us.updateUser(user);
    }

    @DeleteMapping()
    public void deleteUser(@RequestBody User user){
        us.deleteUser(user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id){
        us.deleteUserById(id);
    }

}
