package com.example.demo.repository;

import com.example.demo.model.ComercioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComercioRepository extends JpaRepository<ComercioModel, Long> {
}
