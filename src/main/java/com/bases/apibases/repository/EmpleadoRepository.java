package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Empleado;

@Repository("empleadoRepository")
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {
    List<Empleado> findByIdAgencia(int idAgencia);
}
