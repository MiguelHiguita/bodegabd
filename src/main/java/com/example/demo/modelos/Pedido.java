package com.example.demo.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name="pedidos")
public class Pedido {
    @Id
    @GeneratedValue
    private Integer id;
    private LocalDateTime fechaHora;

}
