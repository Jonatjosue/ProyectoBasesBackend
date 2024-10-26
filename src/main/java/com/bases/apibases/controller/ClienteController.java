package com.bases.apibases.controller;

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
import java.util.List;

import com.bases.apibases.entity.Cliente;
import com.bases.apibases.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin
public class ClienteController {
    
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/buscar")
    public List<Cliente> getBuscar(@RequestParam(required = false) String param) {
        return clienteRepository.findAll();
    }

    @PostMapping("/guardar")
    public Cliente postGuardar(@RequestBody Cliente cliente) {    
        return clienteRepository.save(cliente);
    }
    
    @DeleteMapping("/eliminar/{idCliente}")
    public void eliminar(@PathVariable("idCliente") int idCliente) {
        clienteRepository.deleteById(idCliente);
    }

}
