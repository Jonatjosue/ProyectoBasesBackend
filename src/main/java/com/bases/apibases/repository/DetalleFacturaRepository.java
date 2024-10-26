package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.bases.apibases.entity.DetalleFactura;

@Repository("detalleFacturaRepository")
public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura, Integer> {
    List<DetalleFactura> findByIdFactura(int idFactura);
}
