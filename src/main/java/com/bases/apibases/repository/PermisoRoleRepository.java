package com.bases.apibases.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bases.apibases.entity.PermisoRole;

@Repository("permisoRoleRepository")
public interface PermisoRoleRepository extends JpaRepository<PermisoRole, Integer> {
    List<PermisoRole> findByIdPermisoRole(int idPermisoRole);
}

