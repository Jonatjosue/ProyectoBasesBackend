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
@Table(name = "bitacora_agrega_vehiculo")
public class BitacoraAgregaVehiculo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_bitacora_agrega_vehiculo")
    private int idBitacoraAgregaVehiculo;

    @Column(name = "id_usuario_agrega_vehiculo")
    private Integer idUsuarioAgregaVehiculo;

    @Column(name = "fecha_vehiculo_agregado")
    private LocalDate fechaVehiculoAgregado;

    @Column(name = "id_vehiculo_agregado")
    private Integer idVehiculoAgregado;

    @Column(name = "desc_vehiculo_agregado", length = 100)
    private String descVehiculoAgregado;
    
}
