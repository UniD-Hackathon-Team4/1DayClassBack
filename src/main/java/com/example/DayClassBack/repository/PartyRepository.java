package com.example.DayClassBack.repository;

import com.example.DayClassBack.entity.Party;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, Long> {
}