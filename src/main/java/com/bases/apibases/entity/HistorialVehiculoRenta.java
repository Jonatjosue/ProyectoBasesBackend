package com.bases.apibases.entity;

import lombok.Data;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "historial_vehiculo_renta")
public class HistorialVehiculoRenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_historial_vehiculo_renta")
    private int idHistorialVehiculoRenta;

    @Column(name = "id_detalle_factura")
    private Integer idDetalleFactura;

    @Column(name = "id_renta")
    private Integer idRenta;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "id_vehiculo")
    private Integer idVehiculo;

    @Column(name = "desc_historial_vehiculo_renta", length = 255)
    private String descHistorialVehiculoRenta;

    @Column(name = "historialv_usuario_creacion")
    private Integer historialvUsuarioCreacion;

    @Column(name = "historialv_fecha_creacion")
    private LocalDate historialvFechaCreacion;

    @Column(name = "historialv_usuario_modificacion")
    private Integer historialvUsuarioModificacion;

    @Column(name = "historialv_fecha_modificacion")
    private LocalDate historialvFechaModificacion;
    
}
