package com.bases.apibases.entity;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tipo_transmision")
public class TipoTransmision implements Serializable {

    @Id
    @Column(name = "id_transmision")
    private int idTransmision;

    @Column(name = "desc_transmision")
    private String descTransmision;

    @Column(name = "transmision_usuario_creacion")
    private Integer transmisionUsuarioCreacion;

    @Column(name = "transmision_fecha_creacion")
    private LocalDate transmisionFechaCreacion;

    @Column(name = "transmision_usuario_modificacion")
    private Integer transmisionUsuarioModificacion;

    @Column(name = "transmision_fecha_modificacion")
    private LocalDate transmisionFechaModificacion;
}
