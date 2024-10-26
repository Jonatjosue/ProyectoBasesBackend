package com.bases.apibases.entity;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "rol_usuario")
public class RolUsuario implements Serializable {

    @Id
    @Column(name = "id_rol_usuario")
    private int idRolUsuario;

    @Column(name = "id_role")
    private Integer idRole;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "estado_rol_usuario")
    private String estadoRolUsuario;

    @Column(name = "roluser_usuario_creacion")
    private Integer roluserUsuarioCreacion;

    @Column(name = "roluser_fecha_creacion")
    private LocalDate roluserFechaCreacion;

    @Column(name = "roluser_usuario_modificacion")
    private Integer roluserUsuarioModificacion;

    @Column(name = "roluser_fecha_modificacion")
    private LocalDate roluserFechaModificacion;
}
