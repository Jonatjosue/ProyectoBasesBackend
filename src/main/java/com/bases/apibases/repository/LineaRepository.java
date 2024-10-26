package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Linea;

@Repository("lineaRepository")
public interface LineaRepository extends JpaRepository<Linea, Integer> {
    List<Linea> findByIdLinea(int idLinea);
}
