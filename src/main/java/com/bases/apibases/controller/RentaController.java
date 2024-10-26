package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Renta;
import com.bases.apibases.repository.RentaRepository;

import java.util.List;

@RestController
@RequestMapping("/renta")
@CrossOrigin
public class RentaController {

    @Autowired
    private RentaRepository rentaRepository;

    @GetMapping("/buscar")
    public List<Renta> getBuscar(@RequestParam(required = false) String param) {
        return rentaRepository.findAll();
    }

    @PostMapping("/guardar")
    public Renta postGuardar(@RequestBody Renta renta) {
        return rentaRepository.save(renta);
    }

    @DeleteMapping("/eliminar/{idRenta}")
    public void eliminar(@PathVariable("idRenta") int idRenta) {
        rentaRepository.deleteById(idRenta);
    }
}

