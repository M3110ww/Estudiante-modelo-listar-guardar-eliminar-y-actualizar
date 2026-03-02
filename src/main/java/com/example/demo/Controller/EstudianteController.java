package com.example.demo.Controller;


import com.example.demo.Model.Estudiante;
import com.example.demo.Service.EstudianteService;
import com.example.demo.Service.EstudianteServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController 
@RequestMapping("/api")
public class EstudianteController {

    private final EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Estudiante>> listar() {
        return ResponseEntity.ok(estudianteService.listar());
    }

    @PostMapping("/guardar")
    public ResponseEntity<Estudiante> guardar(@RequestBody Estudiante estudiante) {
        return ResponseEntity.status(201)
                .body(estudianteService.Guardar(estudiante));
    }

    @DeleteMapping("/eliminar/{codigo}")
    public ResponseEntity<Void> eliminar(@PathVariable Long codigo) {
        estudianteService.Eliminar(codigo);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/actualizar/{codigo}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Long codigo,
                                                 @RequestBody Estudiante estudiante) {
        return ResponseEntity.ok(estudianteService.actualizar(codigo, estudiante));
    }

}