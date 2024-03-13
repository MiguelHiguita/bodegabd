package com.example.demo.modelos;

import jakarta.persistence.*;


@Entity
@Table(name="productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer cantidadBodega;
    private String nombre;
    private String referencia;
    private Double precioUnitario;
    private String descripcion;
    private String fotografia;
    private String talla;

}
