package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.TipoTransmision;

@Repository("tipoTransmisionRepository")
public interface TipoTransmisionRepository extends JpaRepository<TipoTransmision, Integer> {
    List<TipoTransmision> findByIdTransmision(int idTransmision);
}

