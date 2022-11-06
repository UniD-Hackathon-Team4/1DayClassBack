package com.example.DayClassBack.repository;

import com.example.DayClassBack.entity.Party;
import com.example.DayClassBack.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(String email);
    // Optional<Users> findByUser_id(Long id);

    Optional<Users> findById(Long id);
    boolean existsByEmail(String email);
}