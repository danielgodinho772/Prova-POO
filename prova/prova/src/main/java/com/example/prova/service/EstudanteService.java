package com.example.prova.service;

import com.example.prova.entity.Estudante;
import com.example.prova.repository.EstudanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteService {

    private final EstudanteRepository repository;

    public EstudanteService(EstudanteRepository repository) {
        this.repository = repository;
    }

    public Estudante salvar(Estudante estudante) {
        return repository.save(estudante);
    }

    public List<Estudante> listarTodos() {
        return repository.findAll();
    }

    public Optional<Estudante> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
