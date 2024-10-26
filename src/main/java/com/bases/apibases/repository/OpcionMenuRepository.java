package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.OpcionMenu;

@Repository("opcionMenuRepository")
public interface OpcionMenuRepository extends JpaRepository<OpcionMenu, Integer> {
    List<OpcionMenu> findByIdOpcionMenu(int idOpcionMenu);
}
