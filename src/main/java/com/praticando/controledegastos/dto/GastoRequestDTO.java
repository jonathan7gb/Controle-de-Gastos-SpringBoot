package com.praticando.controledegastos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GastoRequestDTO {

    private Long id_categoria;
    private String descricao;
    private double valor;
    private LocalDate data;
}
