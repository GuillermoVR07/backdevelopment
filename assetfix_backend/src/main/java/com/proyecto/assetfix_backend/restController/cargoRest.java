package com.proyecto.assetfix_backend.restController;

import com.proyecto.assetfix_backend.model.Cargo;
import com.proyecto.assetfix_backend.service.cargoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.apache.coyote.http11.Constants.a;

@RestController
@RequestMapping("api/cargo/")
public class cargoRest {
    @Autowired
    private cargoServices cargoService;

    @GetMapping("/usuarios")
    public ResponseEntity<List<Cargo>> obtenerTodosLosUsuarios() {
        List<Cargo> usuarios = cargoService.findAll();
        return ResponseEntity.ok(usuarios);
    }
    @GetMapping
 public ResponseEntity<List<Cargo>> getAllCargos() {
     return ResponseEntity.ok(cargoService.findAll());
 }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Cargo>> eliminarCargo(@PathVariable("id") Long idcargo) {
        cargoService.deleteById(idcargo);
        List<Cargo> cargosRestantes = cargoService.findAll();
        return ResponseEntity.ok(cargosRestantes);
    }
    @PostMapping("/crear/")
    public ResponseEntity<Cargo> crearCargo(@RequestBody Cargo cargo) {
        Cargo nuevoUsuario = cargoService.save(cargo);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevoUsuario);
    }

}
