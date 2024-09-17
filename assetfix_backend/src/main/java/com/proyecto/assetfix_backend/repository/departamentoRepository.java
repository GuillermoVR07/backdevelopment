package com.proyecto.assetfix_backend.repository;

import com.proyecto.assetfix_backend.model.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departamentoRepository extends JpaRepository<Departamento, Long> {
}
