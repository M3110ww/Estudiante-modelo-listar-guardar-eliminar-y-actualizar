package com.example.demo.Service;

import com.example.demo.Model.Estudiante;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface EstudianteService {

    List<Estudiante> listar();

    Estudiante Guardar(Estudiante estudiante);

    void Eliminar(Long codigo);

    Estudiante actualizar(Long codigo, Estudiante estudiante);
}
