package com.example.zoraweb.Repository;

import com.example.zoraweb.Models.frymaster.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}
