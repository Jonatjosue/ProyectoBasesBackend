package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Menu;

@Repository("menuRepository")
public interface MenuRepository extends JpaRepository<Menu, Integer> {
    List<Menu> findByIdMenu(int idMenu);
}
