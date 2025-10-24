package com.example.demo.service;

import com.example.demo.model.CompradoresModel;
import com.example.demo.repository.CompradoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompradoresService {
    @Autowired
    private CompradoresRepository compradoresRepository;

    public List<CompradoresModel> obtenerCompradores() {
        return compradoresRepository.findAll();
    }

    public Optional<CompradoresModel> obtenerPorId(Long id) {
        return compradoresRepository.findById(id);
    }

    public CompradoresModel guardarComprador(CompradoresModel comprador) {
        return compradoresRepository.save(comprador);
    }

    public boolean eliminarComprador(Long id) {
        if (compradoresRepository.existsById(id)) {
            compradoresRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
