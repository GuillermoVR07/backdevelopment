package com.proyecto.assetfix_backend.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
@Entity
@Data
@Table
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private BigDecimal sueldo;

}
