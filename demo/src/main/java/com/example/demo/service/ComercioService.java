package com.example.demo.service;

import com.example.demo.model.ComercioModel;
import com.example.demo.repository.ComercioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComercioService {

    @Autowired
    private ComercioRepository comercioRepository;

    public List<ComercioModel> obtenerComercios() {
        return comercioRepository.findAll();
    }

    public Optional<ComercioModel> obtenerPorId(Long id) {
        return comercioRepository.findById(id);
    }

    public ComercioModel guardarComercio(ComercioModel comercio) {
        return comercioRepository.save(comercio);
    }

    public boolean eliminarComercio(Long id) {
        if (comercioRepository.existsById(id)) {
            comercioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
