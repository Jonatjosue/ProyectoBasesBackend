package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Empleado;
import com.bases.apibases.repository.EmpleadoRepository;

import java.util.List;

@RestController
@RequestMapping("/empleado")
@CrossOrigin
public class EmpleadoController {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @GetMapping("/buscar")
    public List<Empleado> getBuscar(@RequestParam(required = false) String param) {
        return empleadoRepository.findAll();
    }

    @PostMapping("/guardar")
    public Empleado postGuardar(@RequestBody Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @DeleteMapping("/eliminar/{idEmpleado}")
    public void eliminar(@PathVariable("idEmpleado") int idEmpleado) {
        empleadoRepository.deleteById(idEmpleado);
    }
}

