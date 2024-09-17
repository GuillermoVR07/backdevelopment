package com.proyecto.assetfix_backend.restController;

import com.proyecto.assetfix_backend.model.Rol;
import com.proyecto.assetfix_backend.repository.rolRepository;
import com.proyecto.assetfix_backend.service.rolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/roles")
public class rolRest {
    @Autowired
    private rolService rolService;

    @GetMapping
    public ResponseEntity<List<Rol>> listarRoles() {
        List<Rol> list=rolService.findAll();
        return ResponseEntity.ok(list);
    }
}
