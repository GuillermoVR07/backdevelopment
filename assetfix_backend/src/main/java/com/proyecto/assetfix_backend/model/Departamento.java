package com.proyecto.assetfix_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    private String descripcion;
}
