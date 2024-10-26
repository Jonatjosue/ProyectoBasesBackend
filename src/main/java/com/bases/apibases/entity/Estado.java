package com.bases.apibases.entity;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "estado")
public class Estado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_estado")
    private int idEstado;

    @Column(name = "desc_estado", length = 255)
    private String descEstado;

    @Column(name = "estado_usuario_creacion")
    private Integer estadoUsuarioCreacion;

    @Column(name = "estado_fecha_creacion")
    private LocalDate estadoFechaCreacion;

    @Column(name = "estado_usuario_modificacion")
    private Integer estadoUsuarioModificacion;

    @Column(name = "estado_fecha_modificacion")
    private LocalDate estadoFechaModificacion;
}
