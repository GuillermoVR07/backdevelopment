package com.proyecto.assetfix_backend.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table

public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column( nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private Long ci;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private String telefono;
    private String fecha_nacimiento;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Rol idrol;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Departamento idDepartamento;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Cargo idcargo;
}
