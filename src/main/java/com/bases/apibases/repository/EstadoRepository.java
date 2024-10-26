package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Estado;

@Repository("estadoRepository")
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
    List<Estado> findByIdEstado(int idEstado);
}

