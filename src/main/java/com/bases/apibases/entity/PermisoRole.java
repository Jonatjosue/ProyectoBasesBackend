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
@Table(name = "permiso_role")
public class PermisoRole implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_permiso_role")
    private int idPermisoRole;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "id_opcion_menu")
    private Integer idOpcionMenu;

    @Column(name = "desc_permiso", length = 255)
    private String descPermiso;

    @Column(name = "permiso_usuario_creacion")
    private Integer permisoUsuarioCreacion;

    @Column(name = "permiso_fecha_creacion")
    private LocalDate permisoFechaCreacion;

    @Column(name = "permiso_usuario_modificacion")
    private Integer permisoUsuarioModificacion;

    @Column(name = "permiso_fecha_modificacion")
    private LocalDate permisoFechaModificacion;
}
