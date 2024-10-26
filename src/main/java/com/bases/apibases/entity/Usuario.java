package com.bases.apibases.entity;

import java.time.LocalDate;

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
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    private int idusuario;

    @Column(name = "idcliente")
    private int idcliente;

    @Column(name = "idempleado")
    private int idempleado;

    @Column(name = "iddentificacion")
    private int iddentificacion;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "segundoNombre")
    private String segundoNombre;

    @Column(name = "primerApellido")
    private String primerApellido;

    @Column(name = "segundoApellido")
    private String segundoApellido;

    @Column(name = "fechaNacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "usuarioUsuarioCreacion")
    private String usuarioUsuarioCreacion;

    @Column(name = "usuarioFechaModificacion")
    private String usuarioFechaModificacion;

    @Column(name = "password")
    private String password;

    @Column(name = "login")
    private String login;

}
