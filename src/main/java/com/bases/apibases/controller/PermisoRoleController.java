package com.bases.apibases.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.PermisoRole;
import com.bases.apibases.repository.PermisoRoleRepository;

import java.util.List;

@RestController
@RequestMapping("/permiso-role")
@CrossOrigin
public class PermisoRoleController {

    @Autowired
    private PermisoRoleRepository permisoRoleRepository;

    @GetMapping("/buscar")
    public List<PermisoRole> getBuscar(@RequestParam(required = false) String param) {
        return permisoRoleRepository.findAll();
    }

    @PostMapping("/guardar")
    public PermisoRole postGuardar(@RequestBody PermisoRole permisoRole) {
        return permisoRoleRepository.save(permisoRole);
    }

    @DeleteMapping("/eliminar/{idPermisoRole}")
    public void eliminar(@PathVariable("idPermisoRole") int idPermisoRole) {
        permisoRoleRepository.deleteById(idPermisoRole);
    }
}

