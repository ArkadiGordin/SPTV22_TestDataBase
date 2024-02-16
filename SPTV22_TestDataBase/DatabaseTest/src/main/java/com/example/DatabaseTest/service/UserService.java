package com.example.DatabaseTest.service;

import com.example.DatabaseTest.entity.User;
import com.example.DatabaseTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    public User getUserById(Long userId) {
        return userRepository.findUserById(userId);
    }
    public void deleteUser(Long userId) {
        userRepository.deleteUser(userId);
    }
    public void addUser(User user) {
    }
}
