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
@Table(name = "role")
public class Role implements Serializable {

    @Id
    @Column(name = "id_role")
    private int idRole;

    @Column(name = "desc_role")
    private String descRole;

    @Column(name = "rol_usuario_creacion")
    private String rolUsuarioCreacion;

    @Column(name = "rol_fecha_creacion")
    private LocalDate rolFechaCreacion;

    @Column(name = "rol_usuario_modificacion")
    private String rolUsuarioModificacion;

    @Column(name = "rol_fecha_modificacion")
    private LocalDate rolFechaModificacion;
}

