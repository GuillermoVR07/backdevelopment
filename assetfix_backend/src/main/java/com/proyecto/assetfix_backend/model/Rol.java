package com.proyecto.assetfix_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String nombre;

    private String Descripcion;
}
