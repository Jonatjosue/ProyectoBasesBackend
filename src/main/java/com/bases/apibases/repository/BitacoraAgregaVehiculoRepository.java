package com.bases.apibases.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bases.apibases.entity.BitacoraAgregaVehiculo;

@Repository("bitacoraAgregaVehiculoRepository")
public interface BitacoraAgregaVehiculoRepository extends JpaRepository<BitacoraAgregaVehiculo, Integer> {
    List<BitacoraAgregaVehiculo> findByIdBitacoraAgregaVehiculo(int idBitacoraAgregaVehiculo);
}
