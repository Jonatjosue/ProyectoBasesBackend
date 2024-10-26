package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Marca;
import com.bases.apibases.repository.MarcaRepository;

import java.util.List;

@RestController
@RequestMapping("/marca")
@CrossOrigin
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping("/buscar")
    public List<Marca> getBuscar(@RequestParam(required = false) String param) {
        return marcaRepository.findAll();
    }

    @PostMapping("/guardar")
    public Marca postGuardar(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }

    @DeleteMapping("/eliminar/{idMarca}")
    public void eliminar(@PathVariable("idMarca") int idMarca) {
        marcaRepository.deleteById(idMarca);
    }
    
}

