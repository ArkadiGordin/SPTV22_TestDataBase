package com.example.DatabaseTest.repository;


import com.example.DatabaseTest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface userRepository  extends JpaRepository<User, Long> {
        }
