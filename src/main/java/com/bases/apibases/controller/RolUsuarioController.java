package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.RolUsuario;
import com.bases.apibases.repository.RolUsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/rol_usuario")
@CrossOrigin
public class RolUsuarioController {

    @Autowired
    private RolUsuarioRepository rolUsuarioRepository;

    @GetMapping("/buscar")
    public List<RolUsuario> getBuscar(@RequestParam(required = false) String param) {
        return rolUsuarioRepository.findAll();
    }

    @PostMapping("/guardar")
    public RolUsuario postGuardar(@RequestBody RolUsuario rolUsuario) {
        return rolUsuarioRepository.save(rolUsuario);
    }

    @DeleteMapping("/eliminar/{idRolUsuario}")
    public void eliminar(@PathVariable("idRolUsuario") int idRolUsuario) {
        rolUsuarioRepository.deleteById(idRolUsuario);
    }
}

