package com.example.demo.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoPrenda")
public class TipoPrenda {
    @Id
    @GeneratedValue
    private Integer id;
    private String nombre;
}
