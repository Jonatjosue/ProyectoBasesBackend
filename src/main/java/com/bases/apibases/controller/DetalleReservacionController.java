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

import com.bases.apibases.entity.DetalleReservacion;
import com.bases.apibases.repository.DetalleReservacionRepository;

@RestController
@RequestMapping("/detalleReservacion")
@CrossOrigin
public class DetalleReservacionController {

    @Autowired
    DetalleReservacionRepository detalleReservacionRepository;

    @GetMapping("/buscar")
    public List<DetalleReservacion> getBuscar(@RequestParam(required = false) String param) {
        return detalleReservacionRepository.findAll();
    }

    @PostMapping("/guardar")
    public DetalleReservacion postGuardar(@RequestBody DetalleReservacion detalleReservacion) {
        return detalleReservacionRepository.save(detalleReservacion);
    }

    @DeleteMapping("/eliminar/{idDetalleReservacion}")
    public void eliminar(@PathVariable("idDetalleReservacion") int idDetalleReservacion) {
        detalleReservacionRepository.deleteById(idDetalleReservacion);
    }
    
}