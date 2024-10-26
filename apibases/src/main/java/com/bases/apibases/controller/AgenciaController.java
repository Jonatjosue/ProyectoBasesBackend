package com.bases.apibases.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bases.apibases.entity.Agencia;
import com.bases.apibases.repository.AgenciaRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


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
    

}
