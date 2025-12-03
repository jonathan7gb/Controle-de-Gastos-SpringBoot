package com.praticando.controledegastos.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="CategoriaGasto")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoriaGasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;

    @Column(nullable = false, length = 100)
    private String nome_categoria;
}
