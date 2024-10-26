package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.TipoTransmision;
import com.bases.apibases.repository.TipoTransmisionRepository;

import java.util.List;

@RestController
@RequestMapping("/tipo_transmision")
@CrossOrigin
public class TipoTransmisionController {

    @Autowired
    private TipoTransmisionRepository tipoTransmisionRepository;

    @GetMapping("/buscar")
    public List<TipoTransmision> getBuscar(@RequestParam(required = false) String param) {
        return tipoTransmisionRepository.findAll();
    }

    @PostMapping("/guardar")
    public TipoTransmision postGuardar(@RequestBody TipoTransmision tipoTransmision) {
        return tipoTransmisionRepository.save(tipoTransmision);
    }

    @DeleteMapping("/eliminar/{idTransmision}")
    public void eliminar(@PathVariable("idTransmision") int idTransmision) {
        tipoTransmisionRepository.deleteById(idTransmision);
    }
}
