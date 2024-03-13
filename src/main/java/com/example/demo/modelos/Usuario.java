package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer telefono;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private String dirección;
    private String genero;
    private String medioPago;
    private String pais;
    private String departamento;
    private String municipio;
    private String codigoPostal;

}
