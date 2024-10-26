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
@Table(name = "detalle_renta")
public class DetalleRenta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_renta")
    private int idDetalleRenta;

    @Column(name = "id_detalle_factura")
    private Integer idDetalleFactura;

    @Column(name = "id_renta")
    private Integer idRenta;

    @Column(name = "detalle_fecha_creacion")
    private LocalDate detalleFechaCreacion;

    @Column(name = "detalle_usuario_creacion")
    private Integer detalleUsuarioCreacion;

    @Column(name = "desc_detalle_renta")
    private String descDetalleRenta;

}