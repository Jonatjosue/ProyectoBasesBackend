package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.bases.apibases.entity.Color;

@Repository("colorRepository")
public interface ColorRepository extends JpaRepository<Color, Integer> {
    List<Color> findByIdColor(int idColor);
}