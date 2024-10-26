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
@Table(name = "color")
public class Color implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_color")
    private int idColor;

    @Column(name = "desc_color")
    private String descColor;

    @Column(name = "color_usuario_creacion")
    private Integer colorUsuarioCreacion;

    @Column(name = "color_fecha_creacion")
    private LocalDate colorFechaCreacion;

    @Column(name = "color_usuario_modificacion")
    private Integer colorUsuarioModificacion;

    @Column(name = "color_fecha_modificacion")
    private LocalDate colorFechaModificacion;
    
}