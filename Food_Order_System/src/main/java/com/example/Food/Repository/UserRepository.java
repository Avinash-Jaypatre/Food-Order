package com.example.Food.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Food.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
