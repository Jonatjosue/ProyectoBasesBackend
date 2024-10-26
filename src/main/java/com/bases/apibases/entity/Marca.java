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
@Table(name = "marca")
public class Marca implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_marca")
    private int idMarca;

    @Column(name = "desc_marca", length = 100)
    private String descMarca;

    @Column(name = "usuario_creacion")
    private Integer usuarioCreacion;

    @Column(name = "marca_fecha_creacion")
    private LocalDate marcaFechaCreacion;

    @Column(name = "marca_usuario_modificacion")
    private Integer marcaUsuarioModificacion;

    @Column(name = "marca_fecha_modificacion")
    private LocalDate marcaFechaModificacion;
}

