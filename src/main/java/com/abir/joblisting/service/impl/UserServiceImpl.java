package com.abir.joblisting.service.impl;

import com.abir.joblisting.model.User;
import com.abir.joblisting.repository.UserRepository;
import com.abir.joblisting.service.UserService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(ObjectId id) {
        return userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("User not found."));
    }

    @Override
    public User updateUserById(ObjectId id, User user) {
        User existingUser = getUserById(id);

        user.setId(existingUser.getId());
        return userRepository.save(user);
    }

    @Override
    public User saveUser(User user) {
        User existingUser = null;
         existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser != null){
            throw new IllegalArgumentException("Username already Registered");
        }
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(ObjectId id) {
        User existingUser = getUserById(id);
        userRepository.delete(existingUser);
    }

}
