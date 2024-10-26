package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.TipoPago;

@Repository("tipoPagoRepository")
public interface TipoPagoRepository extends JpaRepository<TipoPago, Integer> {
    List<TipoPago> findByIdTipoPago(int idTipoPago);
}
