package com.bases.apibases.entity;

import lombok.Data;
import java.io.Serializable;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "detalle_reservacion")
public class DetalleReservacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_reservacion")
    private int idDetalleReservacion;

    @Column(name = "id_reservacion")
    private Integer idReservacion;

    @Column(name = "desc_detalle_reservacion", columnDefinition = "LONG")
    private String descDetalleReservacion;
    
}