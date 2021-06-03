package com.example.appengine.springboot.service;

import com.example.appengine.springboot.model.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
  Optional<User> findUserByEmail(String email);
}
