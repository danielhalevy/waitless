package com.gratitude.gil.service;

import com.gratitude.gil.model.User;
import com.gratitude.gil.repos.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo ur;

    public User createUser(User user) {
        return ur.save(user);
    }

    public Optional<User> getUserById(String id){
        if(ur.findById(id).isPresent())
            return ur.findById(id);
        return Optional.empty();
    }

    public List<User> getAll() {
        return ur.findAll();
    }

    public User updateUser(User user){
        if(ur.findById(user.getId()).isPresent())
            return ur.save(user);
        return null;
    }


    public void deleteUser(User user){
        if(ur.findById(user.getId()).isPresent())
            ur.delete(user);
    }

    public void deleteUserById(String id){
        if(ur.findById(id).isPresent())
            ur.deleteById(id);
    }

}
