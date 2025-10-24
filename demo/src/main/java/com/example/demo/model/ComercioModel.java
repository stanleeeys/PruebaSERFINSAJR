package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "comercio")
public class ComercioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String direccion;
    private Long telefono;
    private String rubro;
    private LocalDateTime fechaRegistro;


    @OneToMany(mappedBy = "comercio")
    private List<CompraModel> compras;
}
