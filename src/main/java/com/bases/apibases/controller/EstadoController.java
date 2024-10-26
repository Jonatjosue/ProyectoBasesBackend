package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Estado;
import com.bases.apibases.repository.EstadoRepository;

import java.util.List;

@RestController
@RequestMapping("/estado")
@CrossOrigin
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;

    @GetMapping("/buscar")
    public List<Estado> getBuscar(@RequestParam(required = false) String param) {
        return estadoRepository.findAll();
    }

    @PostMapping("/guardar")
    public Estado postGuardar(@RequestBody Estado estado) {
        return estadoRepository.save(estado);
    }

    @DeleteMapping("/eliminar/{idEstado}")
    public void eliminar(@PathVariable("idEstado") int idEstado) {
        estadoRepository.deleteById(idEstado);
    }
}
