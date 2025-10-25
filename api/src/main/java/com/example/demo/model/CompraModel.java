package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "compras")
public class CompraModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private BigDecimal montoTotal;
    private LocalDateTime fechaCompra;


    @ManyToOne
    @JoinColumn(name = "id_comercio", nullable = false)
    private ComercioModel comercio;

    @ManyToOne
    @JoinColumn(name = "id_comprador", nullable = false)
    private CompradoresModel comprador;

    @ManyToOne
    @JoinColumn(name = "id_medio_pago", nullable = false)
    private MedioPagoModel medioPago;
}
