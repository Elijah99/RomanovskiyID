package com.bsuir.repository;

import com.bsuir.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    public Role getRoleByName(String name);
}
