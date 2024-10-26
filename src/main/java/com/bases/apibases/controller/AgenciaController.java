package com.bases.apibases.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bases.apibases.entity.Agencia;
import com.bases.apibases.repository.AgenciaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
@RequestMapping("/agencia")
@CrossOrigin
public class AgenciaController {
    
    @Autowired
    AgenciaRepository agenciaRepository;

    @GetMapping("/buscar")
    public List<Agencia> getBuscar(@RequestParam(required = false) String param) {
        return agenciaRepository.findAll();
    }

    @PostMapping("/guardar")
    public Agencia postGuardar(@RequestBody Agencia agencia) {
        return agenciaRepository.save(agencia);
    }

    @PutMapping("actualizar/{idusuario}")
    public ResponseEntity<Agencia> putActualizar(@PathVariable ("idagnecia") int idagencia, @RequestBody Agencia agencia) {
        Agencia agenciaExistente = agenciaRepository.findById(idagencia).orElseThrow();
        agenciaExistente.setNombreAgencia(agencia.getNombreAgencia());
        Agencia agenciaActualizada = agenciaRepository.save(agenciaExistente);
        return ResponseEntity.ok(agenciaActualizada);
    }

    @DeleteMapping("/eliminar/{idagencia}")
    public void eliminar(@PathVariable("idagencia") int idagencia ) {
        agenciaRepository.deleteById(idagencia);
    }
    
    
}
