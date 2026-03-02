package com.example.demo.Service;

import com.example.demo.Model.Estudiante;
import com.example.demo.Repository.EstudianteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImp implements EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteServiceImp(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante Guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void Eliminar(Long codigo) {
        estudianteRepository.deleteById(codigo);
    }

    @Override
    public Estudiante actualizar(Long codigo, Estudiante estudiante) {

        Estudiante estudianteExistente = estudianteRepository.findById(codigo)
                .orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        estudianteExistente.setNombre(estudiante.getNombre());
        estudianteExistente.setTelefono(estudiante.getTelefono());

        return estudianteRepository.save(estudianteExistente);
    }


}

