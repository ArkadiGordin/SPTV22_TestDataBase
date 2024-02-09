package com.example.DatabaseTest.repository;

import com.example.DatabaseTest.entity.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface adminRepository extends CrudRepository<Admin, Long> {
    ;
    List<Admin> findAllAdmins(int Id);
}