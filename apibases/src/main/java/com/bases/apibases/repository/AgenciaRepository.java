package com.bases.apibases.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bases.apibases.entity.Agencia;

@Repository("agenciaRepository")
public interface AgenciaRepository extends JpaRepository <Agencia, Integer> {
    public List<Agencia> findByIdagencia(int idagencia);
}
