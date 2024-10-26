package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bases.apibases.entity.Usuario;
import java.util.List;
import java.util.Optional;

@Repository("usuarioRepository")
public interface UsuarioRepository extends JpaRepository <Usuario, Integer>{
    public List<Usuario> findByIdusuario(int idusuario);
    Optional<Usuario> findByLoginAndPassword(String login, String password);
}
