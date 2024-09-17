package com.proyecto.assetfix_backend.restController;

import com.proyecto.assetfix_backend.model.Empleado;
import com.proyecto.assetfix_backend.service.empleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/empleado")
public class empleadoRest {
    @Autowired
    private empleadoService empleadoService;

    @GetMapping
    public ResponseEntity<List<Empleado>> listOfEmployees() {
        List<Empleado> empleados = empleadoService.findAll();
        return ResponseEntity.ok(empleados);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Empleado> getEmployeeId(@PathVariable("id") Long empleadoId) {
        try {
            Optional<Empleado> empleado = empleadoService.findById(empleadoId);
            return ResponseEntity.of(empleado);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    @PostMapping("/crear")
    public ResponseEntity<Empleado> createEmpleado(@RequestBody Empleado empleado) {

           Empleado nuevoEmpleado=empleadoService.save(empleado);
           return ResponseEntity.status(HttpStatus.CREATED).body(nuevoEmpleado);

    }
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Empleado> updateEmpleado(@PathVariable("id") Long idempleado, @RequestBody Empleado empleado) {
        try{
            empleadoService.UpdateEmployee(idempleado,empleado);
            Empleado empleado1=empleadoService.save(empleado);
            return ResponseEntity.ok(empleado1);
        }catch (Exception e){
            return new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR );
        }
    }
}
