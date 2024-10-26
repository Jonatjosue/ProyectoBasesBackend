package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bases.apibases.entity.HistorialVehiculoRenta;
import com.bases.apibases.repository.HistorialVehiculoRentaRepository;

import java.util.List;

@RestController
@RequestMapping("/historialVehiculoRenta")
@CrossOrigin
public class HistorialVehiculoRentaController {

    @Autowired
    private HistorialVehiculoRentaRepository historialVehiculoRentaRepository;

    @GetMapping("/buscar")
    public List<HistorialVehiculoRenta> getBuscar(@RequestParam(required = false) String param) {
        return historialVehiculoRentaRepository.findAll();
    }

    @PostMapping("/guardar")
    public HistorialVehiculoRenta postGuardar(@RequestBody HistorialVehiculoRenta historialVehiculoRenta) {
        return historialVehiculoRentaRepository.save(historialVehiculoRenta);
    }

    @DeleteMapping("/eliminar/{idHistorialVehiculoRenta}")
    public void eliminar(@PathVariable("idHistorialVehiculoRenta") int idHistorialVehiculoRenta) {
        historialVehiculoRentaRepository.deleteById(idHistorialVehiculoRenta);
    }
}
