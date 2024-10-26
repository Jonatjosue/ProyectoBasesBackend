package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Reservacion;

@Repository("reservacionRepository")
public interface ReservacionRepository extends JpaRepository<Reservacion, Integer> {
    List<Reservacion> findByIdReservacion(int idReservacion);
}
