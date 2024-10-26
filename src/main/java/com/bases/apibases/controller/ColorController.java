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

import com.bases.apibases.entity.Color;
import com.bases.apibases.repository.ColorRepository;

@RestController
@RequestMapping("/color")
@CrossOrigin
public class ColorController {

    @Autowired
    ColorRepository colorRepository;

    @GetMapping("/buscar")
    public List<Color> getBuscar(@RequestParam(required = false) String param) {
        return colorRepository.findAll();
    }

    @PostMapping("/guardar")
    public Color postGuardar(@RequestBody Color color) {
        return colorRepository.save(color);
    }

    @DeleteMapping("/eliminar/{idColor}")
    public void eliminar(@PathVariable("idColor") int idColor) {
        colorRepository.deleteById(idColor);
    }
    
}