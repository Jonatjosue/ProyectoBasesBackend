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
@Table(name = "detalle_factura")
public class DetalleFactura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_factura")
    private int idDetalleFactura;

    @Column(name = "id_tipo_pago")
    private Integer idTipoPago;

    @Column(name = "id_factura")
    private Integer idFactura;

    @Column(name = "total_detalle_factura")
    private Double totalDetalleFactura;

    @Column(name = "detalle_fac_fecha_creacion")
    private LocalDate detalleFacFechaCreacion;

    @Column(name = "detalle_fac_usuario_creacion")
    private Integer detalleFacUsuarioCreacion;

    @Column(name = "detalle_fac_fecha_modificacion")
    private LocalDate detalleFacFechaModificacion;

    @Column(name = "detalle_fac_usuario_modificacion")
    private Integer detalleFacUsuarioModificacion;
    
}

