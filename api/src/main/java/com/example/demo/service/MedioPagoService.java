package com.example.demo.service;

import com.example.demo.model.MedioPagoModel;
import com.example.demo.repository.MedioPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedioPagoService {
    @Autowired
    private MedioPagoRepository medioPagoRepository;

    public List<MedioPagoModel> obtenerMediosPago() {
        return medioPagoRepository.findAll();
    }

    public Optional<MedioPagoModel> obtenerPorId(Long id) {
        return medioPagoRepository.findById(id);
    }

    public MedioPagoModel guardarMedioPago(MedioPagoModel medioPago) {
        return medioPagoRepository.save(medioPago);
    }

    public boolean eliminarMedioPago(Long id) {
        if (medioPagoRepository.existsById(id)) {
            medioPagoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
