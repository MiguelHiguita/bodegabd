package com.example.demo.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="detalles")
public class Detalle {
    @Id
    @GeneratedValue
    private Integer id;
    private Integer cantidadProducto;
    private Double costoTotal;
}
