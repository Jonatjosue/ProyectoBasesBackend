package com.bases.apibases.entity;


import java.io.Serializable;
import java.time.LocalDate;

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
@Table(name = "cliente")
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_cliente")
    private int idCliente;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "desc_cliente")
    private String descCliente;

    @Column(name = "fecha_agrega_cliente")
    private LocalDate fechaAgregaCliente;

    @Column(name = "cliente_usuario_agrega")
    private Integer clienteUsuarioAgrega;

    @Column(name = "fecha_modificacion_cliente")
    private LocalDate fechaModificacionCliente;

    @Column(name = "cliente_usuario_modifica")
    private Integer clienteUsuarioModifica;
    
}
