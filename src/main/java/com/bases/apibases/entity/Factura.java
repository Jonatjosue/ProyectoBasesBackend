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
@Table(name = "factura")
public class Factura implements Serializable {

    @Id
    @Column(name = "id_tipo_pago")
    private int idTipoPago;

    @Id
    @Column(name = "id_factura")
    private int idFactura;

    @Column(name = "desc_factura", length = 255)
    private String descFactura;

    @Column(name = "fecha_factura")
    private LocalDate fechaFactura;

    @Column(name = "monto_total")
    private Double montoTotal;

    @Column(name = "factura_usuario_creacion")
    private Integer facturaUsuarioCreacion;

    @Column(name = "factura_fecha_creacion")
    private LocalDate facturaFechaCreacion;

    @Column(name = "factura_usuario_modificacion")
    private Integer facturaUsuarioModificacion;

    @Column(name = "factura_fecha_modificacion")
    private LocalDate facturaFechaModificacion;
    
}

