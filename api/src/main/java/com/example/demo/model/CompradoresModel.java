package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@Table(name = "compradores")
public class CompradoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String dui;
    private String email;
    private Long telefono;
    private String direccion;
    private LocalDateTime fechaRegistro;


    @OneToMany(mappedBy = "comprador")
    private List<CompraModel> compras;
}
