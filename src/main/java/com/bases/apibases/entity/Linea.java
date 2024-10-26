package com.bases.apibases.entity;

import lombok.Data;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "linea")
public class Linea implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_linea")
    private int idLinea;

    @Column(name = "id_marca")
    private Integer idMarca;

    @Column(name = "desc_linea", length = 255, nullable = false)
    private String descLinea;

    @Column(name = "linea_fecha_creacion")
    private LocalDateTime lineaFechaCreacion;

    @Column(name = "linea_usuario_creacion")
    private Integer lineaUsuarioCreacion;

    @Column(name = "linea_fecha_modificacion")
    private LocalDate lineaFechaModificacion;

    @Column(name = "linea_usuario_modificacion")
    private Integer lineaUsuarioModificacion;
}
