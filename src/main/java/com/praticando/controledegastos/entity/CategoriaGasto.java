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

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private CategoriaGasto categoria;

    @Column(nullable = false, length = 100)
    private String nome_categoria;
}
