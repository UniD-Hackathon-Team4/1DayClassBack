package com.example.DayClassBack.repository;

import com.example.DayClassBack.entity.Party;
import com.example.DayClassBack.entity.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PartyRepository extends JpaRepository<Party, Long> {
    Optional<Party> findById(Long id);
}
