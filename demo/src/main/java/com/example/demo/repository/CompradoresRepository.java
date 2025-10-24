package com.example.demo.repository;

import com.example.demo.model.CompradoresModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompradoresRepository extends JpaRepository<CompradoresModel, Long> {
}
