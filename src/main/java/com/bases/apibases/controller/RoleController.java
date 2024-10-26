package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Role;
import com.bases.apibases.repository.RoleRepository;

import java.util.List;

@RestController
@RequestMapping("/role")
@CrossOrigin
public class RoleController {

    @Autowired
    private RoleRepository roleRepository;

    @GetMapping("/buscar")
    public List<Role> getBuscar(@RequestParam(required = false) String param) {
        return roleRepository.findAll();
    }

    @PostMapping("/guardar")
    public Role postGuardar(@RequestBody Role role) {
        return roleRepository.save(role);
    }

    @DeleteMapping("/eliminar/{idRole}")
    public void eliminar(@PathVariable("idRole") int idRole) {
        roleRepository.deleteById(idRole);
    }
}
