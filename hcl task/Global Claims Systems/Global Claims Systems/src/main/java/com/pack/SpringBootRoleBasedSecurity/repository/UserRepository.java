package com.pack.SpringBootRoleBasedSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pack.SpringBootRoleBasedSecurity.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}