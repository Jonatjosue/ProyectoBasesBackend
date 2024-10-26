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
@Table(name = "vehiculo")
public class Vehiculo implements Serializable {

    @Id
    @Column(name = "id_vehiculo")
    private int idVehiculo;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "id_marca")
    private Integer idMarca;

    @Column(name = "id_color")
    private Integer idColor;

    @Column(name = "id_transmision")
    private Integer idTransmision;

    @Column(name = "id_reservacion")
    private Integer idReservacion;

    @Column(name = "capacidad_personas")
    private Integer capacidadPersonas;

    @Column(name = "kilometraje")
    private Integer kilometraje;

    @Column(name = "base64_img")
    private String base64Img;

    @Column(name = "numero_placa")
    private String numeroPlaca;

    @Column(name = "vehiculo_usuario_creacion")
    private Integer vehiculoUsuarioCreacion;

    @Column(name = "vehiculo_fecha_creacion")
    private LocalDate vehiculoFechaCreacion;

    @Column(name = "vehiculo_usuario_modificacion")
    private Integer vehiculoUsuarioModificacion;

    @Column(name = "vehiculo_fecha_modificacion")
    private LocalDate vehiculoFechaModificacion;
    
}

