package com.example.DatabaseTest.repository;


import com.example.DatabaseTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
        User findByName(String name);
        User getAllUsers(String id);
        User findUserById(Long userId);
        void deleteUser(Long userId);
        User addUser(User user);
        }
