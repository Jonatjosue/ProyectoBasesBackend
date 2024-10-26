package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Factura;
import com.bases.apibases.repository.FacturaRepository;

import java.util.List;

@RestController
@RequestMapping("/factura")
@CrossOrigin
public class FacturaController {

    @Autowired
    private FacturaRepository facturaRepository;

    @GetMapping("/buscar")
    public List<Factura> getBuscar(@RequestParam(required = false) String param) {
        return facturaRepository.findAll();
    }

    @PostMapping("/guardar")
    public Factura postGuardar(@RequestBody Factura factura) {
        return facturaRepository.save(factura);
    }

}
