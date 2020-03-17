package com.spring.security.jpa.springsecurityjpa.repository;

import com.spring.security.jpa.springsecurityjpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
