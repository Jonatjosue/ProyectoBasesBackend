package com.bases.apibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.bases.apibases.entity.Cliente;

@Repository("clienteRepository")
public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
    public List<Cliente> findByIdCliente(int idCliente);
}
