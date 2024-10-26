package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Reservacion;
import com.bases.apibases.repository.ReservacionRepository;

import java.util.List;

@RestController
@RequestMapping("/reservacion")
@CrossOrigin
public class ReservacionController {

    @Autowired
    private ReservacionRepository reservacionRepository;

    @GetMapping("/buscar")
    public List<Reservacion> getBuscar(@RequestParam(required = false) String param) {
        return reservacionRepository.findAll();
    }

    @PostMapping("/guardar")
    public Reservacion postGuardar(@RequestBody Reservacion reservacion) {
        return reservacionRepository.save(reservacion);
    }

    @DeleteMapping("/eliminar/{idReservacion}")
    public void eliminar(@PathVariable("idReservacion") int idReservacion) {
        reservacionRepository.deleteById(idReservacion);
    }
}
