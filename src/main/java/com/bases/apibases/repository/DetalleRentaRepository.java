package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.DetalleRenta;

@Repository("detalleRentaRepository")
public interface DetalleRentaRepository extends JpaRepository<DetalleRenta, Integer> {
    List<DetalleRenta> findByIdDetalleFactura(int idDetalleFactura);
}