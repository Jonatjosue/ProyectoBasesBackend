package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Linea;
import com.bases.apibases.repository.LineaRepository;

import java.util.List;

@RestController
@RequestMapping("/linea")
@CrossOrigin
public class LineaController {

    @Autowired
    private LineaRepository lineaRepository;

    @GetMapping("/buscar")
    public List<Linea> getBuscar(@RequestParam(required = false) String param) {
        return lineaRepository.findAll();
    }

    @PostMapping("/guardar")
    public Linea postGuardar(@RequestBody Linea linea) {
        return lineaRepository.save(linea);
    }

    @DeleteMapping("/eliminar/{idLinea}")
    public void eliminar(@PathVariable("idLinea") int idLinea) {
        lineaRepository.deleteById(idLinea);
    }
}
