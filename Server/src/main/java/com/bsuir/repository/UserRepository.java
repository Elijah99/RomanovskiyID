package com.bsuir.repository;

import com.bsuir.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsername(String username);

    Optional<User> findById(Long userId);

    void deleteById(Long userId);
}