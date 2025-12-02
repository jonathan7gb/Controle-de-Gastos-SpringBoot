package com.praticando.controledegastos.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "Gasto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long id_categoria;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private LocalDate data;
}
