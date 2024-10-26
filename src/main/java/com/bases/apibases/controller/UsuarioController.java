package com.bases.apibases.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.bases.apibases.entity.Usuario;
import com.bases.apibases.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping("/buscar")
    public List<Usuario> getBuscar(@RequestParam(required = false) String param) {
        return usuarioRepository.findAll();
    }

    @PostMapping("/guardar")
    public Usuario postGuardar(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PostMapping("/login")
    public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByLoginAndPassword(usuario.getLogin(),
                usuario.getPassword());
        return usuarioOptional.map(usuarioEncontrado -> new ResponseEntity<>(usuarioEncontrado, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.UNAUTHORIZED));
    }

    @DeleteMapping("/eliminar/{idusuario}")
    public void eliminar(@PathVariable("idusuario") int idusuario) {
        usuarioRepository.deleteById(idusuario);
    }

}
