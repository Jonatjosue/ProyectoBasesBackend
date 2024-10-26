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
import java.time.LocalDate;

@Data
@Entity
@Table(name = "opcion_menu")
public class OpcionMenu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_opcion_menu")
    private int idOpcionMenu;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "id_menu")
    private Integer idMenu;

    @Column(name = "nombre_opcion_menu", length = 255)
    private String nombreOpcionMenu;

    @Column(name = "opmenu_usuario_creacion")
    private Integer opmenuUsuarioCreacion;

    @Column(name = "opmenu_fecha_creacion")
    private LocalDate opmenuFechaCreacion;

    @Column(name = "opmenu_usuario_modificacion")
    private Integer opmenuUsuarioModificacion;

    @Column(name = "opmenu_fecha_modificacion")
    private LocalDate opmenuFechaModificacion;
}
