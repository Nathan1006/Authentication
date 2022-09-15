package com.example.demo.Repositories;

import com.example.demo.Models.Auth.ERole;
import com.example.demo.Models.Auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
