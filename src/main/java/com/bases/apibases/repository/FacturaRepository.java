package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Factura;

@Repository("facturaRepository")
public interface FacturaRepository extends JpaRepository<Factura, Integer> {
    List<Factura> findByIdFactura(int idFactura);
}
