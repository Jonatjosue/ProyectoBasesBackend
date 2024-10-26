package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.DetalleReservacion;

@Repository("detalleReservacionRepository")
public interface DetalleReservacionRepository extends JpaRepository<DetalleReservacion, Integer> {
    List<DetalleReservacion> findByIdReservacion(int idReservacion);
}
