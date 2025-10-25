package com.example.demo.repository;

import com.example.demo.model.MedioPagoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedioPagoRepository extends JpaRepository<MedioPagoModel, Long> {
}
