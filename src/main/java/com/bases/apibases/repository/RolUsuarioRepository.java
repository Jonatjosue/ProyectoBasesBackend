package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.RolUsuario;

@Repository("rolUsuarioRepository")
public interface RolUsuarioRepository extends JpaRepository<RolUsuario, Integer> {
    List<RolUsuario> findByIdRolUsuario(int idRolUsuario);
}

