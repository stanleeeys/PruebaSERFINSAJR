package com.example.demo.service;

import com.example.demo.model.CompraModel;
import com.example.demo.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {
    @Autowired
    private CompraRepository compraRepository;

    public List<CompraModel> obtenerCompras() {
        return compraRepository.findAll();
    }

    public Optional<CompraModel> obtenerPorId(Long id) {
        return compraRepository.findById(id);
    }

    public CompraModel guardarCompra(CompraModel compra) {
        return compraRepository.save(compra);
    }

    public boolean eliminarCompra(Long id) {
        if (compraRepository.existsById(id)) {
            compraRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
