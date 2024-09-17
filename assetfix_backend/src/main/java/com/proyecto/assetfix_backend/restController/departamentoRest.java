package com.proyecto.assetfix_backend.restController;

import com.proyecto.assetfix_backend.model.Departamento;
import com.proyecto.assetfix_backend.service.departamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/departamento")
public class departamentoRest {
    @Autowired
    private departamentoService depService;

    @GetMapping
    public ResponseEntity<List<Departamento>> listarDepartamentos() {
        List<Departamento> list=depService.findAll();
        return ResponseEntity.ok(list);
    }
    @PostMapping("/crear")
    public ResponseEntity<Departamento> crear(@RequestBody Departamento departamento ){
        try{
            return  ResponseEntity.ok(depService.save(departamento));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

}
