package com.example.zoraweb.Repository;

import com.example.zoraweb.frymaster.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Long, User> {
    User findByfry_user(String fry_user);
}
