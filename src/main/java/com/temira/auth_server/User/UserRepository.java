package com.temira.auth_server.User;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, java.util.UUID> {
    Optional<User> findByUsername(String username); 
}
