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
@Table(name = "menu")
public class Menu implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_menu")
    private int idMenu;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "nombre_menu", length = 255)
    private String nombreMenu;

    @Column(name = "menu_usuario_creacion")
    private Integer menuUsuarioCreacion;

    @Column(name = "menu_fecha_creacion")
    private LocalDate menuFechaCreacion;

    @Column(name = "menu_usuario_modificacion")
    private Integer menuUsuarioModificacion;

    @Column(name = "menu_fecha_modificacion")
    private LocalDate menuFechaModificacion;
}

