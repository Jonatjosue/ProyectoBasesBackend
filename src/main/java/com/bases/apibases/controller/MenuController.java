package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Menu;
import com.bases.apibases.repository.MenuRepository;

import java.util.List;

@RestController
@RequestMapping("/menu")
@CrossOrigin
public class MenuController {

    @Autowired
    private MenuRepository menuRepository;

    @GetMapping("/buscar")
    public List<Menu> getBuscar(@RequestParam(required = false) String param) {
        return menuRepository.findAll();
    }

    @PostMapping("/guardar")
    public Menu postGuardar(@RequestBody Menu menu) {
        return menuRepository.save(menu);
    }

    @DeleteMapping("/eliminar/{idMenu}")
    public void eliminar(@PathVariable("idMenu") int idMenu) {
        menuRepository.deleteById(idMenu);
    }
}

