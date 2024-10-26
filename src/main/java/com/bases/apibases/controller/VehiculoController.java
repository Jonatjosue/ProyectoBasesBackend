package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.Vehiculo;
import com.bases.apibases.repository.VehiculoRepository;

import java.util.List;

@RestController
@RequestMapping("/vehiculo")
@CrossOrigin
public class VehiculoController {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @GetMapping("/buscar")
    public List<Vehiculo> getBuscar(@RequestParam(required = false) String param) {
        return vehiculoRepository.findAll();
    }

    @PostMapping("/guardar")
    public Vehiculo postGuardar(@RequestBody Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @DeleteMapping("/eliminar/{idVehiculo}")
    public void eliminar(@PathVariable("idVehiculo") int idVehiculo) {
        vehiculoRepository.deleteById(idVehiculo);
    }
}

