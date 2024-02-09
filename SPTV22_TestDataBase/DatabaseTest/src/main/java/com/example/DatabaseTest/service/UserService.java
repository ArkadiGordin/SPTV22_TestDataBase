package com.example.DatabaseTest.service;

import com.example.DatabaseTest.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User addUser(User user);
    void delete(long id);
    User getByName(String name);
    User editUser(User user);
    List<User> getAll();


    User getUserById(long id);
}
