package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Renta;

@Repository("rentaRepository")
public interface RentaRepository extends JpaRepository<Renta, Integer> {
    List<Renta> findByIdRenta(int idRenta);
}

