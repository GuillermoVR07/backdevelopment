package com.proyecto.assetfix_backend.repository;

import com.proyecto.assetfix_backend.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empleadoRepository extends JpaRepository<Empleado, Long>
{
}
