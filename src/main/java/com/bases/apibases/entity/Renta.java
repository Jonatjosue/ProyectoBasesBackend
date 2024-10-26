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
@Table(name = "renta")
public class Renta implements Serializable {

    @Id
    @Column(name = "id_detalle_factura")
    private int idDetalleFactura;

    @Id
    @Column(name = "id_renta")
    private int idRenta;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "fecha_renta")
    private LocalDate fechaRenta;

    @Column(name = "valor_renta")
    private Double valorRenta;

    @Column(name = "fecha_limite_renta")
    private LocalDate fechaLimiteRenta;

    @Column(name = "monto_renta")
    private Double montoRenta;

    @Column(name = "renta_usuario_creacion")
    private Integer rentaUsuarioCreacion;

    @Column(name = "renta_fecha_creacion")
    private LocalDate rentaFechaCreacion;

    @Column(name = "renta_usuario_modificacion")
    private Integer rentaUsuarioModificacion;

    @Column(name = "renta_fecha_modificacion")
    private LocalDate rentaFechaModificacion;
}

