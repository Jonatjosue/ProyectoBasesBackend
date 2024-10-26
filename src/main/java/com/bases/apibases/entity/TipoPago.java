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
@Table(name = "tipo_pago")
public class TipoPago implements Serializable {

    @Id
    @Column(name = "id_tipo_pago")
    private int idTipoPago;

    @Column(name = "desc_pago")
    private String descPago;

    @Column(name = "tpago_usuario_creacion")
    private Integer tpagoUsuarioCreacion;

    @Column(name = "tpago_fecha_creacion")
    private LocalDate tpagoFechaCreacion;

    @Column(name = "tpago_usuario_modificacion")
    private Integer tpagoUsuarioModificacion;

    @Column(name = "tpago_fecha_modificacion")
    private LocalDate tpagoFechaModificacion;
}
