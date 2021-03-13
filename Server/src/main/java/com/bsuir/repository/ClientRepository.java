package com.bsuir.repository;

import com.bsuir.entity.Client;
import com.bsuir.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client,Long> {
    Optional<Client> findById(Long id);
    Client findByUserInfo(User user);
}
