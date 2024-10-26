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
@Table(name = "empleado")
public class Empleado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_empleado")
    private int idEmpleado;

    @Column(name = "id_agencia")
    private Integer idAgencia;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "codigo_empleado")
    private Integer codigoEmpleado;

    @Column(name = "empleado_usuario_creacion")
    private Integer empleadoUsuarioCreacion;

    @Column(name = "empleado_fecha_creacion")
    private LocalDate empleadoFechaCreacion;

    @Column(name = "empleado_usuario_modificacion")
    private Integer empleadoUsuarioModificacion;

    @Column(name = "empleado_fecha_modificacion")
    private LocalDate empleadoFechaModificacion;
}
