package com.bases.apibases.entity;

import lombok.Data;
import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "reservacion")
public class Reservacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_reservacion")
    private int idReservacion;

    @Column(name = "id_estado")
    private Integer idEstado;

    @Column(name = "id_detalle_factura")
    private Integer idDetalleFactura;

    @Column(name = "id_renta")
    private Integer idRenta;

    @Column(name = "fecha_reservacion")
    private LocalDate fechaReservacion;

    @Column(name = "valor_reservacion")
    private Double valorReservacion;

    @Column(name = "id_usuario_crea_reservacion")
    private Integer idUsuarioCreaReservacion;

    @Column(name = "fecha_limite_reservacion")
    private LocalDate fechaLimiteReservacion;

    @Column(name = "monto_reservacion")
    private Double montoReservacion;

    @Column(name = "reserva_usuario_creacion")
    private Integer reservaUsuarioCreacion;

    @Column(name = "reserva_fecha_creacion")
    private LocalDate reservaFechaCreacion;

    @Column(name = "reserva_usuario_modificacion")
    private Integer reservaUsuarioModificacion;

    @Column(name = "reserva_fecha_modificacion")
    private LocalDate reservaFechaModificacion;
}

