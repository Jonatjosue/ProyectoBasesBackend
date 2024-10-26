package com.bases.apibases.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.HistorialVehiculoRenta;

@Repository("historialVehiculoRentaRepository")
public interface HistorialVehiculoRentaRepository extends JpaRepository<HistorialVehiculoRenta, Integer> {
    List<HistorialVehiculoRenta> findByIdHistorialVehiculoRenta(int idHistorialVehiculoRenta);
}

