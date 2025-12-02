package com.praticando.controledegastos.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GastoResponseDTO {

    private Long id;
    private String nome_categoria;
    private String descricao;
    private double valor;
    private LocalDate data;
}
