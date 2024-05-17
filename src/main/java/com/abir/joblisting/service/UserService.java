package com.abir.joblisting.service;

import com.abir.joblisting.model.User;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    public User getUserById(ObjectId id);
    public User updateUserById(ObjectId id, User user);
    public User saveUser(User user);
    public void deleteUserById(ObjectId id);
}
