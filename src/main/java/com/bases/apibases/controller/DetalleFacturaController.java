package com.bases.apibases.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bases.apibases.entity.DetalleFactura;
import com.bases.apibases.repository.DetalleFacturaRepository;

@RestController
@RequestMapping("/detalleFactura")
@CrossOrigin
public class DetalleFacturaController {

    @Autowired
    DetalleFacturaRepository detalleFacturaRepository;

    @GetMapping("/buscar")
    public List<DetalleFactura> getBuscar(@RequestParam(required = false) String param) {
        return detalleFacturaRepository.findAll();
    }

    @PostMapping("/guardar")
    public DetalleFactura postGuardar(@RequestBody DetalleFactura detalleFactura) {
        return detalleFacturaRepository.save(detalleFactura);
    }

    @DeleteMapping("/eliminar/{idDetalleFactura}")
    public void eliminar(@PathVariable("idDetalleFactura") int idDetalleFactura) {
        detalleFacturaRepository.deleteById(idDetalleFactura);
    }
    
}