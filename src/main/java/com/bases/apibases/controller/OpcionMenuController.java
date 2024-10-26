package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.OpcionMenu;
import com.bases.apibases.repository.OpcionMenuRepository;

import java.util.List;

@RestController
@RequestMapping("/opcion-menu")
@CrossOrigin
public class OpcionMenuController {

    @Autowired
    private OpcionMenuRepository opcionMenuRepository;

    @GetMapping("/buscar")
    public List<OpcionMenu> getBuscar(@RequestParam(required = false) String param) {
        return opcionMenuRepository.findAll();
    }

    @PostMapping("/guardar")
    public OpcionMenu postGuardar(@RequestBody OpcionMenu opcionMenu) {
        return opcionMenuRepository.save(opcionMenu);
    }

    @DeleteMapping("/eliminar/{idOpcionMenu}")
    public void eliminar(@PathVariable("idOpcionMenu") int idOpcionMenu) {
        opcionMenuRepository.deleteById(idOpcionMenu);
    }
}

