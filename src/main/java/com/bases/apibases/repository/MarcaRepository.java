package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Marca;

@Repository("marcaRepository")
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
    List<Marca> findByIdMarca(int idMarca);
}
