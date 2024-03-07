package com.example.collegeinfo.Repository;

import com.example.collegeinfo.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Collegerepo extends JpaRepository<College, Long> {
    Optional<College> findByName(String name);
}