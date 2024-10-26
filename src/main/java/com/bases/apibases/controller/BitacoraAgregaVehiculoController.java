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

import com.bases.apibases.entity.BitacoraAgregaVehiculo;
import com.bases.apibases.repository.BitacoraAgregaVehiculoRepository;

@RestController
@RequestMapping("/bitacoraAgregaVehiculo")
@CrossOrigin
public class BitacoraAgregaVehiculoController {

    @Autowired
    BitacoraAgregaVehiculoRepository bitacoraAgregaVehiculoRepository;

 @GetMapping("/buscar")
    public List<BitacoraAgregaVehiculo> getBuscar(@RequestParam(required = false) String param) {
        return bitacoraAgregaVehiculoRepository.findAll();
    }

    @PostMapping("/guardar")
    public BitacoraAgregaVehiculo postGuardar(@RequestBody BitacoraAgregaVehiculo bitacoraAgregaVehiculo) {    
        return bitacoraAgregaVehiculoRepository.save(bitacoraAgregaVehiculo);
    }
    
    @DeleteMapping("/eliminar/{idBitacoraAgregaVehiculo}")
    public void eliminar(@PathVariable("idBitacoraAgregaVehiculo") int idBitacoraAgregaVehiculo) {
        bitacoraAgregaVehiculoRepository.deleteById(idBitacoraAgregaVehiculo);
    }
    
}