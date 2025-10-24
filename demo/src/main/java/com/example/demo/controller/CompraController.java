package com.example.demo.controller;

import com.example.demo.model.CompraModel;
import com.example.demo.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compras")
@CrossOrigin(origins = "http://localhost:4200")

public class CompraController {
    @Autowired
    private CompraService compraService;

    @GetMapping
    public List<CompraModel> obtenerCompras() {
        return compraService.obtenerCompras();
    }
    @GetMapping("/{id}")
    public Optional<CompraModel> obtenerCompraPorId(@PathVariable Long id) {
        return compraService.obtenerPorId(id);
    }
    @PostMapping
    public CompraModel guardarCompra(@RequestBody CompraModel compra) {
        return compraService.guardarCompra(compra);
    }
    @DeleteMapping("/{id}")
    public String eliminarCompra(@PathVariable Long id) {
        boolean ok = compraService.eliminarCompra(id);
        return ok ? "Se elimino la compra" : "Error al eliminar la compra";
    }


}
