package com.bases.apibases.controller;

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
import java.util.List;

import com.bases.apibases.entity.DetalleRenta;
import com.bases.apibases.repository.DetalleRentaRepository;

@RestController
@RequestMapping("/detalleRenta")
@CrossOrigin
public class DetalleRentaController {

    @Autowired
    DetalleRentaRepository detalleRentaRepository;

    @GetMapping("/buscar")
    public List<DetalleRenta> getBuscar(@RequestParam(required = false) String param) {
        return detalleRentaRepository.findAll();
    }

    @PostMapping("/guardar")
    public DetalleRenta postGuardar(@RequestBody DetalleRenta detalleRenta) {
        return detalleRentaRepository.save(detalleRenta);
    }

    @DeleteMapping("/eliminar/{idDetalleRenta}")
    public void eliminar(@PathVariable("idDetalleRenta") int idDetalleRenta) {
        detalleRentaRepository.deleteById(idDetalleRenta);
    }
    
}
