package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "medio_pago")
public class MedioPagoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;

    // Relación con compras
    @OneToMany(mappedBy = "medioPago", cascade = CascadeType.ALL)
    private List<CompraModel> compras;
}
