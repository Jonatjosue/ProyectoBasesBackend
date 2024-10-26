package com.bases.apibases.entity;

import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "agencia")
public class Agencia implements Serializable {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idagencia;

    @Column(name = "nombreAgencia")
    private String nombreAgencia;

    @Column(name = "Agencia")
    private String Agencia;

    @Column(name = "AgenciaFechaCreacion")
    private String AgenciaFechaCreacion;

}
